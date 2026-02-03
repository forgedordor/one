package defpackage;

import android.media.MediaPlayer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ypt extends fcyz implements fdat {
    final /* synthetic */ yqa a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypt(fcxy fcxyVar, yqa yqaVar) {
        super(2, fcxyVar);
        this.a = yqaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ypt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        yqa yqaVar = this.a;
        MediaPlayer mediaPlayer = yqaVar.d;
        mediaPlayer.getClass();
        mediaPlayer.setDataSource(yqaVar.a, yqaVar.b);
        MediaPlayer mediaPlayer2 = yqaVar.d;
        mediaPlayer2.getClass();
        mediaPlayer2.prepare();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ypt yptVar = new ypt(fcxyVar, this.a);
        yptVar.b = obj;
        return yptVar;
    }
}
