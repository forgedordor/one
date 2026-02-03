package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvwm extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ cvwo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvwm(cvwo cvwoVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = cvwoVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cvwm cvwmVar = new cvwm(this.c, (fcxy) obj3);
        cvwmVar.a = (ajlk) obj;
        cvwmVar.b = (aoer) obj2;
        return cvwmVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aoer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [ajlk, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcti fctiVar;
        fctl.b(obj);
        ?? r13 = this.a;
        ?? r0 = this.b;
        if (!cvwo.c(r13) || r0 == 0) {
            return null;
        }
        if (r0.q().length() == 0) {
            String strP = r0.p();
            if (strP == null) {
                strP = "";
            }
            fctiVar = new fcti(strP, null);
        } else {
            fctiVar = new fcti(r0.q(), r0.p());
        }
        cvwo cvwoVar = this.c;
        return new cvwp(new dkeg((String) fctiVar.a, (String) fctiVar.b, null, null, null, new dkdk(djrr.dK), null, new fdae() { // from class: cvwj
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        }, 92), cvwoVar.a.getString(R.string.active_sim));
    }
}
