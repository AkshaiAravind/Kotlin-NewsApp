interface NewsApi {

    @GET("/v2/top-headlines")
    fun getNews(
        @Query("country") country: String,
        @Query("category") category: String? = null, // Optional category
        @Query("apiKey") key: String = "92e382ccdc0244e2b59e91cbb27431bc" // Default API key
    ): Call<NewsDataFromJson>

    @GET("/v2/top-headlines")
    fun getGlobalNews(
        @Query("category") category: String = "general", // Default category
        @Query("language") language: String = "en", // Default language
        @Query("apiKey") key: String = "92e382ccdc0244e2b59e91cbb27431bc" // Default API key
    ): Call<NewsDataFromJson>
}