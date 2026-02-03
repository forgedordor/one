package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dest extends deoe {
    public dest(Context context, dcfl dcflVar) {
        super(context, dcflVar);
    }

    @Override // defpackage.deoe
    public final defn a(String str, String str2, byte[] bArr) {
        dcfq dcfqVar = this.k;
        desq desqVar = new desq(dcfqVar, str, str2, bArr);
        dcfqVar.b(desqVar);
        return dclg.a(desqVar, new dclf() { // from class: dess
            @Override // defpackage.dclf
            public final Object a(dcfx dcfxVar) {
                return Integer.valueOf(((desr) dcfxVar).a);
            }
        });
    }
}
