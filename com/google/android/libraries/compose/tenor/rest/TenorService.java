package com.google.android.libraries.compose.tenor.rest;

import defpackage.fdkf;
import defpackage.fhev;
import defpackage.fhfe;
import defpackage.fhfj;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface TenorService {
    @fhev(a = "v1/autocomplete")
    fdkf<SearchSuggestionsResponse> autoCompleteSearch(@fhfj(a = "key") String str, @fhfj(a = "q") String str2, @fhfj(a = "limit") int i, @fhfj(a = "locale") String str3);

    @fhev(a = "v1/categories")
    fdkf<CategoriesResponse> getCategories(@fhfj(a = "key") String str, @fhfj(a = "locale") String str2, @fhfj(a = "contentfilter") String str3);

    @fhev(a = "v1/search")
    fdkf<MediaResultsResponse> getGifs(@fhfj(a = "key") String str, @fhfj(a = "q") String str2, @fhfj(a = "limit") int i, @fhfj(a = "locale") String str3, @fhfj(a = "contentfilter") String str4, @fhfj(a = "searchfilter") String str5);

    @fhev(a = "v1/gifs")
    fdkf<MediaResultsResponse> getGifsById(@fhfj(a = "key") String str, @fhfj(a = "ids") String str2);

    @fhev(a = "v1/search_suggestions")
    fdkf<SearchSuggestionsResponse> getSearchSuggestions(@fhfj(a = "key") String str, @fhfj(a = "q") String str2, @fhfj(a = "limit") int i, @fhfj(a = "locale") String str3);

    @fhfe(a = "v1/registershare")
    fdkf<RegisterShareResponse> registerShare(@fhfj(a = "key") String str, @fhfj(a = "id") String str2);
}
