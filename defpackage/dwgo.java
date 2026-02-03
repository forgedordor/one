package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwgo implements dwdz {
    private static final String a = "dwgo";

    @Override // defpackage.dwdz
    public final dwdy a() {
        return new dwgz();
    }

    @Override // defpackage.dwdz
    public final String b() {
        return "link_preview";
    }

    @Override // defpackage.dwdz
    public final void c(dwje dwjeVar, dwqw dwqwVar, dwhr dwhrVar) {
        dvhv.c(a, "Error, received a link preview type message which is unexpected.");
    }

    @Override // defpackage.dwdz
    public final void d(dwje dwjeVar, dwqw dwqwVar, dwhr dwhrVar) {
        dvhv.c(a, "attempt to send a message of type link preview");
    }

    @Override // defpackage.dwdz
    public final void e() {
        eork.i(true);
    }

    @Override // defpackage.dwdz
    public final ListenableFuture f(dwqw dwqwVar) {
        return eork.i(dwqwVar);
    }
}
