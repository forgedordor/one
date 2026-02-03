package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azga extends dqqf implements azfx {
    @Deprecated
    public azga(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, azgh azghVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, azgl.a, dqwjVar, dqtmVar, azghVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new azfn();
    }

    public final long c() {
        return getLong(cO(0, azgl.a));
    }

    public final MessageIdType e() {
        return new MessageIdType(getLong(cO(1, azgl.a)));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length == 0 || (length == 1 && jArrDC[0] == -1)) {
            int i = ekgb.d;
            return ekoe.a;
        }
        HashSet hashSet = new HashSet();
        dqtm dqtmVar = this.d;
        boolean zDj = dj(0);
        boolean z = dqtmVar.b;
        MessageIdType[] messageIdTypeArr = null;
        long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, azgl.a)))) : new long[]{c()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: azfy
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        if (dj(1)) {
            if (z) {
                long[] jArrDt = dt(getString(cO(1, azgl.a)));
                int length2 = jArrDt.length;
                MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                for (int i2 = 0; i2 < length2; i2++) {
                    messageIdTypeArr2[i2] = new MessageIdType(jArrDt[i2]);
                }
                messageIdTypeArr = (MessageIdType[]) dqru.D(null, messageIdTypeArr2, new MessageIdType[0]);
            } else {
                messageIdTypeArr = new MessageIdType[]{e()};
            }
        }
        dqqf.dA(length, messageIdTypeArr, new ejxr() { // from class: azfz
            @Override // defpackage.ejxr
            public final Object get() {
                return "message_id:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        ekfw ekfwVar = new ekfw();
        for (int i3 = 0; i3 < length; i3++) {
            long j = jArrDC[i3];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArrDC[i3]));
                String[] strArr = azgl.a;
                azfp azfpVar = new azfp();
                azfpVar.aF();
                azfpVar.aD();
                long j2 = jArrDC[i3];
                if (jArrC != null) {
                    long j3 = jArrC[i3];
                    azfpVar.aE(0);
                    azfpVar.a = j3;
                }
                if (messageIdTypeArr != null) {
                    MessageIdType messageIdType = messageIdTypeArr[i3];
                    azfpVar.aE(1);
                    azfpVar.b = messageIdType;
                }
                azfn azfnVar = new azfn();
                azfnVar.aD(azfpVar.aB());
                azfnVar.a = azfpVar.a;
                azfnVar.b = azfpVar.b;
                azfnVar.cM = azfpVar.aC();
                ekfwVar.h(azfnVar);
            }
        }
        return ekfwVar.g();
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
