package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kig implements fdat {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ Object[] c;

    public kig(String str, String str2, Object[] objArr) {
        this.a = str;
        this.b = str2;
        this.c = objArr;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) throws Exception {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            String str = this.a;
            String str2 = this.b;
            Object[] objArr = this.c;
            khy.a(str, str2, hmlVar, Arrays.copyOf(objArr, objArr.length));
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
