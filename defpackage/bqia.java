package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqia extends dqqf implements bqhx {
    @Deprecated
    public bqia(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bqie bqieVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bqik.a, dqwjVar, dqtmVar, bqieVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bqhn();
    }

    public final MessageIdType c() {
        return new MessageIdType(getLong(cO(0, bqik.a)));
    }

    public final cgvx e() {
        byte[] blob = getBlob(cO(1, bqik.a));
        if (blob == null) {
            return null;
        }
        try {
            return (cgvx) evsn.parseFrom(cgvx.a, blob, evrr.a());
        } catch (Throwable unused) {
            return cgvx.a;
        }
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        MessageIdType[] messageIdTypeArr;
        cgvx cgvxVar;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                cgvx[] cgvxVarArr = null;
                if (!zDj) {
                    messageIdTypeArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(0, bqik.a)));
                    int length2 = jArrDt.length;
                    MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                    for (int i = 0; i < length2; i++) {
                        messageIdTypeArr2[i] = new MessageIdType(jArrDt[i]);
                    }
                    messageIdTypeArr = (MessageIdType[]) dqru.D(null, messageIdTypeArr2, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{c()};
                }
                dqqf.dA(length, messageIdTypeArr, new ejxr() { // from class: bqhy
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "message_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                if (dj(1)) {
                    if (z) {
                        List listDf = df(getString(cO(1, bqik.a)));
                        cgvx[] cgvxVarArr2 = new cgvx[listDf.size()];
                        Iterator it = listDf.iterator();
                        int i2 = 0;
                        while (it.hasNext()) {
                            try {
                                byte[] bArrZ = dqru.z((String) it.next());
                                int i3 = i2 + 1;
                                if (bArrZ == null) {
                                    cgvxVar = null;
                                } else {
                                    try {
                                        cgvxVar = (cgvx) evsn.parseFrom(cgvx.a, bArrZ);
                                    } catch (Throwable unused) {
                                        i2 = i3;
                                        cgvxVarArr2[i2] = null;
                                        i2++;
                                    }
                                }
                                cgvxVarArr2[i2] = cgvxVar;
                                i2 = i3;
                            } catch (Throwable unused2) {
                            }
                        }
                        cgvxVarArr = (cgvx[]) dqru.D(null, cgvxVarArr2, new cgvx[0]);
                    } else {
                        cgvxVarArr = new cgvx[]{e()};
                    }
                }
                dqqf.dA(length, cgvxVarArr, new ejxr() { // from class: bqhz
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "sharing_state:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i4 = 0; i4 < length; i4++) {
                    long j = jArrDC[i4];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i4]));
                        String[] strArr = bqik.a;
                        bqhp bqhpVar = new bqhp();
                        bqhpVar.aF();
                        bqhpVar.aD();
                        long j2 = jArrDC[i4];
                        if (messageIdTypeArr != null) {
                            bqhpVar.b(messageIdTypeArr[i4]);
                        }
                        if (cgvxVarArr != null) {
                            bqhpVar.c(cgvxVarArr[i4]);
                        }
                        ekfwVar.h(bqhpVar.a());
                    }
                }
                return ekfwVar.g();
            }
        }
        int i5 = ekgb.d;
        return ekoe.a;
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
