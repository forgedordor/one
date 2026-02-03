package com.google.android.libraries.compose.tenor.rest;

import defpackage.esye;
import defpackage.fctc;
import defpackage.fctd;
import defpackage.fdae;
import defpackage.fdbk;
import defpackage.fdev;
import defpackage.fdey;
import defpackage.fdkf;
import defpackage.fhdx;
import defpackage.fhen;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class TenorRepository {
    public static final Companion Companion = new Companion(null);
    private final String apiKey;
    private final String contentFilter;
    private final fctc service$delegate;

    /* compiled from: PG */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String currentLocale() {
            String languageTag = Locale.getDefault().toLanguageTag();
            languageTag.getClass();
            return languageTag;
        }

        public /* synthetic */ Companion(fdbk fdbkVar) {
            this();
        }
    }

    public TenorRepository(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.apiKey = str;
        this.contentFilter = str2;
        this.service$delegate = fctd.a(new fdae() { // from class: com.google.android.libraries.compose.tenor.rest.TenorRepository$$ExternalSyntheticLambda0
            @Override // defpackage.fdae
            public final Object invoke() {
                return TenorRepository.service_delegate$lambda$0();
            }
        });
    }

    private final TenorService getService() {
        return (TenorService) this.service$delegate.a();
    }

    private final fdkf<MediaResultsResponse> search(String str, String str2) {
        return getService().getGifs(this.apiKey, str, 50, Companion.currentLocale(), this.contentFilter, str2);
    }

    public static /* synthetic */ fdkf searchSuggestions$default(TenorRepository tenorRepository, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 20;
        }
        return tenorRepository.searchSuggestions(str, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TenorService service_delegate$lambda$0() {
        fhdx fhdxVar = new fhdx();
        fhdxVar.d(TenorRepositoryKt.TENOR_URL);
        fhdxVar.c(fhen.c(new esye().a()));
        fhdxVar.b(CoroutineCallAdapterFactory.Companion.create());
        return (TenorService) fhdxVar.a().a(TenorService.class);
    }

    public final fdkf<SearchSuggestionsResponse> autoCompleteSearch(String str, int i) {
        str.getClass();
        return getService().autoCompleteSearch(this.apiKey, str, i, Companion.currentLocale());
    }

    public final fdkf<CategoriesResponse> getCategories() {
        return getService().getCategories(this.apiKey, Companion.currentLocale(), this.contentFilter);
    }

    public final fdkf<MediaResultsResponse> getGifsById(fdev<String> fdevVar) {
        fdevVar.getClass();
        return getService().getGifsById(this.apiKey, fdey.m(fdevVar, null, 63));
    }

    public final fdkf<RegisterShareResponse> registerShare(String str) {
        str.getClass();
        return getService().registerShare(this.apiKey, str);
    }

    public final fdkf<MediaResultsResponse> searchGifs(String str) {
        str.getClass();
        return search(str, "-sticker");
    }

    public final fdkf<MediaResultsResponse> searchGifsAndStickers(String str) {
        str.getClass();
        return search(str, "none");
    }

    public final fdkf<MediaResultsResponse> searchStickers(String str) {
        str.getClass();
        return search(str, "sticker");
    }

    public final fdkf<SearchSuggestionsResponse> searchSuggestions(String str, int i) {
        str.getClass();
        return getService().getSearchSuggestions(this.apiKey, str, i, Companion.currentLocale());
    }
}
