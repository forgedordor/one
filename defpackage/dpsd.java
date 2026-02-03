package defpackage;

import androidx.media3.exoplayer.ExoPlayer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpsd extends fcyz implements fdat {
    Object a;
    int b;
    /* synthetic */ boolean c;
    final /* synthetic */ dpsf d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpsd(dpsf dpsfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = dpsfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((dpsd) c(bool, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        boolean z;
        ExoPlayer exoPlayer;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            z = this.c;
            Object obj2 = this.a;
            fctl.b(obj);
            exoPlayer = obj2;
        } else {
            fctl.b(obj);
            z = this.c;
            exoPlayer = this.d.h;
        }
        while (z && exoPlayer != null) {
            dpsf dpsfVar = this.d;
            dpsfVar.e.f(new Long(fddu.k(exoPlayer.x(), dpsfVar.d)));
            this.a = exoPlayer;
            this.c = true;
            this.b = 1;
            if (fdkj.c(100L, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dpsd dpsdVar = new dpsd(this.d, fcxyVar);
        dpsdVar.c = ((Boolean) obj).booleanValue();
        return dpsdVar;
    }
}
