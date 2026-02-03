package defpackage;

import com.google.android.rcs.client.messaging.data.AutoOneOf_Message_MessageContent;
import com.google.android.rcs.client.messaging.data.ContentType;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dful {
    public static ekgb a(dgyx dgyxVar) throws NumberFormatException, IOException {
        if (dgyxVar.a != dgyw.CPIM_MESSAGE) {
            ContentType contentTypeE = ContentType.e(dgyxVar.h);
            efhg efhgVar = new efhg();
            efhgVar.b(evqs.x(dgyxVar.f));
            efhgVar.c(contentTypeE);
            return ekgb.r(AutoOneOf_Message_MessageContent.a(efhgVar.a()));
        }
        ebcp ebcpVarB = ebcp.b(dgyxVar.f);
        if (!ebcpVarB.r()) {
            efgz efgzVar = ((efgn) efhe.a(dgyxVar.f)).c;
            ContentType contentTypeE2 = ContentType.e((String) efgzVar.g().orElseThrow(new Supplier() { // from class: dfuj
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new IllegalArgumentException("No Content-Type given!");
                }
            }));
            efhg efhgVar2 = new efhg();
            efhgVar2.b(((efgp) efgzVar).a);
            efhgVar2.c(contentTypeE2);
            return ekgb.r(AutoOneOf_Message_MessageContent.a(efhgVar2.a()));
        }
        String strH = ebcpVarB.h();
        if (strH == null) {
            int i = ekgb.d;
            return ekoe.a;
        }
        ekfw ekfwVar = new ekfw();
        dfuk dfukVar = new dfuk(ekfwVar);
        byte[] bArr = ebcpVarB.c;
        if (bArr == null || bArr.length == 0) {
            int i2 = ekgb.d;
            return ekoe.a;
        }
        dfpy.b(new ByteArrayInputStream(bArr), strH, dfukVar);
        return ekfwVar.g();
    }
}
