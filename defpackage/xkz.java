package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xkz extends fcyz implements fdat {
    final /* synthetic */ xlm a;
    final /* synthetic */ Context b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xkz(fcxy fcxyVar, xlm xlmVar, Context context) {
        super(2, fcxyVar);
        this.a = xlmVar;
        this.b = context;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xkz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.b(this.b, R.string.audio_recorder_call_in_progress);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        xkz xkzVar = new xkz(fcxyVar, this.a, this.b);
        xkzVar.c = obj;
        return xkzVar;
    }
}
