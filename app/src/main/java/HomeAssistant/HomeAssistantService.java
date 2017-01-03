package HomeAssistant;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface HomeAssistantService {
    @GET("api/events")
    Call<List<Event>> listEvents(@Path("user") String user);
}