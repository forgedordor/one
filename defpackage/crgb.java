package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crgb extends fcyz implements fdat {
    int a;
    final /* synthetic */ crgd b;
    final /* synthetic */ List c;
    final /* synthetic */ MessageCoreData d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crgb(fcxy fcxyVar, crgd crgdVar, List list, MessageCoreData messageCoreData) {
        super(2, fcxyVar);
        this.b = crgdVar;
        this.c = list;
        this.d = messageCoreData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crgb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[Catch: Exception -> 0x0016, TryCatch #2 {Exception -> 0x0016, blocks: (B:6:0x000e, B:18:0x0050, B:20:0x0054, B:36:0x00ac, B:7:0x0012, B:15:0x0038, B:12:0x0021), top: B:48:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c0  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crgb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        crgb crgbVar = new crgb(fcxyVar, this.b, this.c, this.d);
        crgbVar.e = obj;
        return crgbVar;
    }
}
