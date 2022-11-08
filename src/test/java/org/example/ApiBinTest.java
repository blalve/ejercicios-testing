package org.example;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.Test;


import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static junit.framework.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApiBinTest {


    @Test
    public void testGetBinconJson() throws IOException, InterruptedException, ParseException {

        //Given
        // configurar el cliente Web que haga la petición
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().
                version(HttpClient.Version.HTTP_2)
                .uri(URI.create("https://httpbin.org/ip"))
                .build();
        //When
        // realizar la peticion
        HttpResponse<String> response = client.send(
                request,
               HttpResponse.BodyHandlers.ofString());

        //Then
        //comprobar que la respuesta a nuestra petición es correcta
        // status code
        int responseStatusCode = response.statusCode();
        assertEquals(
                200,
                responseStatusCode,
                "El código a devolver debería ser 200");

        //Datos de la cabecera

        HttpHeaders httpHeaders = response.headers();
        assertEquals("application/json", httpHeaders.firstValue("content-type").get());

        // Datos del body
        String responseBody = response.body();
        System.out.println(responseBody);
        assertNotNull(responseBody, "El valor debe ser diferente a null");
        // Transformamos la string a un objeto Java JSON
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(responseBody);
        // obtenemos el valor de un atributo deel objeto JSON
        String origin = jsonObject.get("origin").toString();
        // verificamos su contenido
        assertNotNull(origin, "El origen debe ser diferente a null");
        System.out.println(origin);


    }

    @Test
    public void testGetBinconParams() throws IOException, InterruptedException, ParseException {
        // Given
        // configurar el cliente Web que haga la petición
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .uri(URI.create("https://httpbin.org/get?param1=mundo&param2=hola"))
                .build();
        // When
        // realizar la petición
        HttpResponse<String> response = client.send(
                request,
                HttpResponse.BodyHandlers.ofString());
        // Then
        // comprobar que la respuesta a nuestra petición es correcta
        int responseStatusCode = response.statusCode();
        assertEquals(
                200,
                responseStatusCode,
                "El código a devolver debería ser 200");
        // Datos del body
        String responseBody = response.body();
        System.out.println(responseBody);
        assertNotNull(responseBody, "El valor debe ser diferente a null");
        // Transformamos la string a un objeto Java JSON
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(responseBody);
        JSONObject args = (JSONObject) jsonObject.get("args");
        String param1 = (String )args.get("param1");
        System.out.println("param1: "+ param1);
        assertEquals("mundo", param1);
        String param2 = (String )args.get("param2");
        System.out.println("param2: "+ param2);
        assertEquals("hola", param2);
    }

    @Test
    public void testGetBinBody() throws IOException, InterruptedException, ParseException {
        // Given
        // configurar el cliente Web que haga la petición
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .uri(URI.create("https://httpbin.org/get?param1=mundo&param2=hola"))
                .build();
        // When
        // realizar la petición
        HttpResponse<String> response = client.send(
                request,
                HttpResponse.BodyHandlers.ofString());
        // Then
        // comprobar que la respuesta a nuestra petición es correcta

        // Datos del body
        String responseBody = response.body();
        System.out.println(responseBody);
        assertNotNull(responseBody, "El valor debe ser diferente a null");
        // Transformamos la string a un objeto Java JSON
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(responseBody);
        JSONObject args = (JSONObject) jsonObject.get("args");
        String param1 = (String )args.get("param1");
        System.out.println("param1: "+ param1);
        assertEquals("mundo", param1);
        String param2 = (String )args.get("param2");
        System.out.println("param2: "+ param2);
        assertEquals("hola", param2);
        JSONObject headers1= (JSONObject) jsonObject.get(("headers"));
        System.out.println(headers1);
    }

    @Test
    public void testGetBinconParams3() throws IOException, InterruptedException, ParseException {
        // Given
        // configurar el cliente Web que haga la petición
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .uri(URI.create("https://httpbin.org/get?param1=me&param2=llamo&param3=blanca"))
                .build();
        // When
        // realizar la petición
        HttpResponse<String> response = client.send(
                request,
                HttpResponse.BodyHandlers.ofString());
        // Then
        // comprobar que la respuesta a nuestra petición es correcta
        int responseStatusCode = response.statusCode();
        assertEquals(
                200,
                responseStatusCode,
                "El código a devolver debería ser 200");
        // Datos del body
        String responseBody = response.body();
        System.out.println(responseBody);
        assertNotNull(responseBody, "El valor debe ser diferente a null");
        // Transformamos la string a un objeto Java JSON
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(responseBody);
        JSONObject args = (JSONObject) jsonObject.get("args");
        String param1 = (String )args.get("param1");
        System.out.println("param1: "+ param1);
        assertEquals("me", param1);
        String param2 = (String )args.get("param2");
        System.out.println("param2: "+ param2);
        assertEquals("llamo", param2);
        String param3 = (String )args.get("param3");
        System.out.println("param3: "+ param3);
        assertEquals("blanca", param3);
        System.out.println(param1+ " "+ param2 + " " + param3);
    }
    @Test
    public void testOtroGetBin() throws IOException, InterruptedException, ParseException {
        // Given
        // configurar el cliente Web que haga la petición
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .uri(URI.create("https://httpbin.org/get?param1=me&param2=llamo&param3=blanca"))
                .build();
        // When
        // realizar la petición
        HttpResponse<String> response = client.send(
                request,
                HttpResponse.BodyHandlers.ofString());
        // Then
        // comprobar que la respuesta a nuestra petición es correcta
        int responseStatusCode = response.statusCode();
        assertEquals(
                200,
                responseStatusCode,
                "El código a devolver debería ser 200");
        // Datos del body
        String responseBody = response.body();
        System.out.println(responseBody);
        assertNotNull(responseBody, "El valor debe ser diferente a null");
        // Transformamos la string a un objeto Java JSON
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(responseBody);
        JSONObject args = (JSONObject) jsonObject.get("args");
        String param1 = (String )args.get("param1");
        System.out.println("param1: "+ param1);
        assertEquals("me", param1);
        String param2 = (String )args.get("param2");
        System.out.println("param2: "+ param2);
        assertEquals("llamo", param2);
        String param3 = (String )args.get("param3");
        System.out.println("param3: "+ param3);
        assertEquals("blanca", param3);
        System.out.println(param1+ " "+ param2 + " " + param3);
    }

    @Test
    public void testPostRequest() throws IOException, InterruptedException, URISyntaxException, ParseException {
        //Given
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .build();
        // creamos objetos json para los datos que vamos a introducir o postear
        JSONObject obj = new JSONObject();
        obj.put("name", "Blanca Alvarez");
        obj.put("age", "23");
        obj.put("ubication", "Malaga");
        HttpRequest request = HttpRequest
                .newBuilder(new URI("https://httpbin.org/post"))
                .version(HttpClient.Version.HTTP_2)
                .POST(HttpRequest.BodyPublishers.ofString(obj.toJSONString()))
                .build();

        //when
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        int responseStatusCode = response.statusCode();
        String reponseBody = response.body();
        System.out.println("httpGetRequest: " + reponseBody);

        //then
        assertEquals(
                200,
                responseStatusCode);
        String responseBody = response.body();

        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(responseBody);
        JSONObject json = (JSONObject) jsonObject.get("json");

        assertEquals("Blanca Alvarez", json.get("name"));
        assertEquals("23", json.get("age"));
        assertEquals("Malaga", json.get("ubication"));

        System.out.println(json);
        System.out.println(json.get("name"));


    }
}
