package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wzc extends fcyz implements fdat {
    final /* synthetic */ wze a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wzc(fcxy fcxyVar, wze wzeVar) {
        super(2, fcxyVar);
        this.a = wzeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wzc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        wze wzeVar = this.a;
        Context context = wzeVar.a;
        String string = context.getString(R.string.send_sound_pref_key);
        string.getClass();
        return Boolean.valueOf(wzeVar.c.q(string, context.getResources().getBoolean(R.bool.send_sound_pref_default)));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        wzc wzcVar = new wzc(fcxyVar, this.a);
        wzcVar.b = obj;
        return wzcVar;
    }
}
