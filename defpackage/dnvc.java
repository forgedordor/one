package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dnvc implements adi, fdbl {
    final /* synthetic */ dnve a;

    public dnvc(dnve dnveVar) {
        this.a = dnveVar;
    }

    @Override // defpackage.adi
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        dnve dnveVar = this.a;
        Uri uri = (Uri) obj;
        abvd abvdVar = dnveVar.h;
        if (abvdVar != null) {
            abvdVar.a(dnwy.c);
        }
        if (uri != null) {
            fdil.d(dnveVar.c, null, null, new dnvd(dnveVar, uri, null), 3);
            return;
        }
        ((ekrd) dnve.a.h().h("com/google/android/libraries/compose/emotify/controller/EmotifyCreationLauncherImpl", "onActivityResult", 91, "EmotifyCreationLauncherImpl.kt")).q("No Emotify result returned.");
        if (abvdVar != null) {
            abvdVar.d(dnww.a);
        }
        dnwx dnwxVar = dnveVar.d;
        if (dnwxVar != null) {
            dnwxVar.a();
        }
    }

    @Override // defpackage.fdbl
    public final fcsy b() {
        return new fdbo(1, this.a, dnve.class, "onActivityResult", "onActivityResult(Landroid/net/Uri;)V", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof adi) && (obj instanceof fdbl)) {
            return fdbq.f(b(), ((fdbl) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
