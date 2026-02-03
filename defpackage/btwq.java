package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btwq extends dqqf implements btwn {
    @Deprecated
    public btwq(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, btwv btwvVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, btwx.a, dqwjVar, dqtmVar, btwvVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new btwd();
    }

    public final MessageIdType c() {
        return new MessageIdType(getLong(cO(0, btwx.a)));
    }

    public final clmt e() {
        return clmt.b(getInt(cO(1, btwx.a)));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        MessageIdType[] messageIdTypeArr;
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
        clmt[] clmtVarArr = null;
        if (!zDj) {
            messageIdTypeArr = null;
        } else if (z) {
            long[] jArrDt = dt(getString(cO(0, btwx.a)));
            int length2 = jArrDt.length;
            MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                messageIdTypeArr2[i2] = new MessageIdType(jArrDt[i2]);
            }
            messageIdTypeArr = (MessageIdType[]) dqru.D(null, messageIdTypeArr2, new MessageIdType[0]);
        } else {
            messageIdTypeArr = new MessageIdType[]{c()};
        }
        dqqf.dA(length, messageIdTypeArr, new ejxr() { // from class: btwo
            @Override // defpackage.ejxr
            public final Object get() {
                return "message_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        if (dj(1)) {
            if (z) {
                int[] iArrDs = ds(getString(cO(1, btwx.a)));
                clmt[] clmtVarArr2 = new clmt[iArrDs.length];
                for (int i3 = 0; i3 < iArrDs.length; i3++) {
                    clmt clmtVarB = clmt.b(iArrDs[i3]);
                    if (clmtVarB == null) {
                        throw new IllegalStateException();
                    }
                    clmtVarArr2[i3] = clmtVarB;
                }
                clmtVarArr = (clmt[]) dqru.D(null, clmtVarArr2, new clmt[0]);
            } else {
                clmtVarArr = new clmt[]{e()};
            }
        }
        dqqf.dA(length, clmtVarArr, new ejxr() { // from class: btwp
            @Override // defpackage.ejxr
            public final Object get() {
                return "help_state:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        ekfw ekfwVar = new ekfw();
        for (int i4 = 0; i4 < length; i4++) {
            long j = jArrDC[i4];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArrDC[i4]));
                String[] strArr = btwx.a;
                btwf btwfVar = new btwf();
                btwfVar.aF();
                btwfVar.aD();
                long j2 = jArrDC[i4];
                if (messageIdTypeArr != null) {
                    MessageIdType messageIdType = messageIdTypeArr[i4];
                    btwfVar.aE(0);
                    btwfVar.a = messageIdType;
                }
                if (clmtVarArr != null) {
                    clmt clmtVar = clmtVarArr[i4];
                    btwfVar.aE(1);
                    btwfVar.b = clmtVar;
                }
                btwd btwdVar = new btwd();
                btwdVar.aD(btwfVar.aB());
                btwdVar.a = btwfVar.a;
                btwdVar.b = btwfVar.b;
                btwdVar.cM = btwfVar.aC();
                ekfwVar.h(btwdVar);
            }
        }
        return ekfwVar.g();
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
