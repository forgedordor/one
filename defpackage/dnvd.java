package defpackage;

import android.net.Uri;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnvd extends fcyz implements fdat {
    int a;
    final /* synthetic */ dnve b;
    final /* synthetic */ Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnvd(dnve dnveVar, Uri uri, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dnveVar;
        this.c = uri;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnvd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dnve dnveVar = this.b;
            Uri uri = this.c;
            this.a = 1;
            obj = dnveVar.b.b(uri, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        Uri uri2 = this.c;
        if (obj == null) {
            Objects.toString(uri2);
            throw new IllegalStateException("Can't create sticker from ".concat(uri2.toString()));
        }
        dnvg dnvgVar = (dnvg) obj;
        ((ekrd) dnve.a.h().h("com/google/android/libraries/compose/emotify/controller/EmotifyCreationLauncherImpl$onActivityResult$1", "invokeSuspend", 85, "EmotifyCreationLauncherImpl.kt")).t("Received Emotify result: %s", uri2.toString());
        dnve dnveVar2 = this.b;
        abvd abvdVar = dnveVar2.h;
        if (abvdVar != null) {
            abvdVar.d(dnww.c);
        }
        dnwx dnwxVar = dnveVar2.d;
        if (dnwxVar != null) {
            dnwxVar.a();
        }
        fdae fdaeVar = dnveVar2.f;
        if (fdaeVar == null) {
            fdbq.c("draftController");
            fdaeVar = null;
        }
        ((dnhl) fdaeVar.invoke()).b.f(dnvgVar);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnvd(this.b, this.c, fcxyVar);
    }
}
