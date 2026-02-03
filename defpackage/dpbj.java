package defpackage;

import android.net.Uri;
import com.google.android.libraries.compose.tenor.rest.TenorRepository;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpbj implements doam {
    public static final dpbb a = new dpbb();
    public final TenorRepository b;

    public dpbj(String str, String str2) {
        this.b = new TenorRepository(str, str2);
    }

    @Override // defpackage.doam
    public final Uri a(String str) {
        Uri uriBuild = Uri.parse("https://reportingwidget.google.com/widget/49?").buildUpon().appendQueryParameter("cid", str).appendQueryParameter("url", str).build();
        uriBuild.getClass();
        return uriBuild;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.doam
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, int r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.dpbc
            if (r0 == 0) goto L13
            r0 = r7
            dpbc r0 = (defpackage.dpbc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dpbc r0 = new dpbc
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r7)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r7)
            com.google.android.libraries.compose.tenor.rest.TenorRepository r7 = r4.b
            fdkf r5 = r7.autoCompleteSearch(r5, r6)
            r0.c = r3
            java.lang.Object r7 = r5.c(r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            com.google.android.libraries.compose.tenor.rest.SearchSuggestionsResponse r7 = (com.google.android.libraries.compose.tenor.rest.SearchSuggestionsResponse) r7
            java.util.List r5 = r7.getResults()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpbj.b(java.lang.String, int, fcxy):java.lang.Object");
    }

    @Override // defpackage.doam
    public final /* synthetic */ Object c(String str, fcxy fcxyVar) {
        return doak.a(this, str, fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.doam
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.dpbe
            if (r0 == 0) goto L13
            r0 = r6
            dpbe r0 = (defpackage.dpbe) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dpbe r0 = new dpbe
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L40
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.fctl.b(r6)
            com.google.android.libraries.compose.tenor.rest.TenorRepository r6 = r5.b
            fdkf r6 = r6.getCategories()
            r0.c = r3
            java.lang.Object r6 = r6.c(r0)
            if (r6 == r1) goto L77
        L40:
            com.google.android.libraries.compose.tenor.rest.CategoriesResponse r6 = (com.google.android.libraries.compose.tenor.rest.CategoriesResponse) r6
            java.util.List r6 = r6.getTags()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.fcva.p(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L55:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L76
            java.lang.Object r1 = r6.next()
            com.google.android.libraries.compose.tenor.rest.Category r1 = (com.google.android.libraries.compose.tenor.rest.Category) r1
            doan r2 = new doan
            java.lang.String r3 = r1.getName()
            java.lang.String r4 = r1.getSearchterm()
            java.lang.String r1 = r1.getImage()
            r2.<init>(r3, r4, r1)
            r0.add(r2)
            goto L55
        L76:
            return r0
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpbj.d(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.doam
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.dpbf
            if (r0 == 0) goto L13
            r0 = r6
            dpbf r0 = (defpackage.dpbf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dpbf r0 = new dpbf
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L40
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            com.google.android.libraries.compose.tenor.rest.TenorRepository r6 = r4.b
            fdkf r5 = r6.registerShare(r5)
            r0.c = r3
            java.lang.Object r6 = r5.c(r0)
            if (r6 == r1) goto L5f
        L40:
            com.google.android.libraries.compose.tenor.rest.RegisterShareResponse r6 = (com.google.android.libraries.compose.tenor.rest.RegisterShareResponse) r6
            java.lang.String r5 = r6.getStatus()
            java.lang.String r6 = "ok"
            boolean r6 = defpackage.fdbq.f(r5, r6)
            if (r6 == 0) goto L51
            fctx r5 = defpackage.fctx.a
            return r5
        L51:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Failed to register share (status \""
            java.lang.String r1 = "\")"
            java.lang.String r5 = defpackage.a.a(r5, r0, r1)
            r6.<init>(r5)
            throw r6
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpbj.e(java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.doam
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.CharSequence r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.dpbg
            if (r0 == 0) goto L13
            r0 = r8
            dpbg r0 = (defpackage.dpbg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dpbg r0 = new dpbg
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r8)
            goto L48
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            defpackage.fctl.b(r8)
            com.google.android.libraries.compose.tenor.rest.TenorRepository r8 = r6.b
            java.lang.String r7 = r7.toString()
            r2 = 2
            r4 = 0
            r5 = 0
            fdkf r7 = com.google.android.libraries.compose.tenor.rest.TenorRepository.searchSuggestions$default(r8, r7, r5, r2, r4)
            r0.c = r3
            java.lang.Object r8 = r7.c(r0)
            if (r8 != r1) goto L48
            return r1
        L48:
            com.google.android.libraries.compose.tenor.rest.SearchSuggestionsResponse r8 = (com.google.android.libraries.compose.tenor.rest.SearchSuggestionsResponse) r8
            java.util.List r7 = r8.getResults()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpbj.f(java.lang.CharSequence, fcxy):java.lang.Object");
    }

    @Override // defpackage.doam
    public final Object g(String str, fcxy fcxyVar) {
        dpbb dpbbVar = a;
        return dpbbVar.a(this.b.searchGifs(str), new dpbh(dpbbVar), fcxyVar);
    }

    @Override // defpackage.doam
    public final Object h(String str, fcxy fcxyVar) {
        dpbb dpbbVar = a;
        return dpbbVar.a(this.b.searchStickers(str), new dpbi(dpbbVar), fcxyVar);
    }

    @Override // defpackage.doam
    public final Object i() {
        return fctx.a;
    }
}
