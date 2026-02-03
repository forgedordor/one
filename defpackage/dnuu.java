package defpackage;

import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnuu implements fdau {
    final /* synthetic */ ComposeView a;
    final /* synthetic */ boolean b;
    final /* synthetic */ fdae c;
    final /* synthetic */ dnux d;

    public dnuu(ComposeView composeView, boolean z, fdae fdaeVar, dnux dnuxVar) {
        this.a = composeView;
        this.b = z;
        this.c = fdaeVar;
        this.d = dnuxVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        ((cyg) obj).getClass();
        String string = this.a.getContext().getString(R.string.emotify_create_button);
        string.getClass();
        djrr djrrVar = djrr.dT;
        hmlVar.v(-1633490746);
        final fdae fdaeVar = this.c;
        boolean zD = hmlVar.D(fdaeVar);
        final dnux dnuxVar = this.d;
        boolean zF = zD | hmlVar.F(dnuxVar);
        Object objF = hmlVar.f();
        if (zF || objF == hmk.a) {
            objF = new fdae() { // from class: dnut
                @Override // defpackage.fdae
                public final Object invoke() {
                    if (!((Boolean) fdaeVar.invoke()).booleanValue()) {
                        dnux dnuxVar2 = dnuxVar;
                        ((ekrd) dnux.a.h().h("com/google/android/libraries/compose/emotify/controller/EmotifyButtonControllerImpl$addView$1$1$1$2", "invoke$lambda$1$lambda$0", 65, "EmotifyButtonControllerImpl.kt")).q("Create Emotify button clicked.");
                        dnuxVar2.a().b();
                    }
                    return fctx.a;
                }
            };
            hmlVar.y(objF);
        }
        hmlVar.o();
        diwk.b(new diwa(string, djrrVar, false, this.b, (fdae) objF), null, hmlVar, 0);
        return fctx.a;
    }
}
