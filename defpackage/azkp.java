package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azkp extends dqqf implements azjk {
    @Deprecated
    public azkp(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, azkx azkxVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, azlc.a, dqwjVar, dqtmVar, azkxVar);
    }

    public final String A() {
        return getString(cO(21, azlc.a));
    }

    public final String B() {
        return getString(cO(9, azlc.a));
    }

    public final String C() {
        return getString(cO(8, azlc.a));
    }

    public final String D() {
        return getString(cO(20, azlc.a));
    }

    public final boolean E() {
        return getInt(cO(23, azlc.a)) == 1;
    }

    public final boolean F() {
        return getInt(cO(5, azlc.a)) == 1;
    }

    public final boolean G() {
        return getInt(cO(4, azlc.a)) == 1;
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new azgt();
    }

    public final int c() {
        return getInt(cO(15, azlc.a));
    }

    public final int e() {
        return getInt(cO(3, azlc.a));
    }

    public final int f() {
        return getInt(cO(14, azlc.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        MessageIdType[] messageIdTypeArr;
        Optional[] optionalArr;
        axcm[] axcmVarArr;
        long[] jArr;
        HashSet hashSet;
        ConversationIdType[] conversationIdTypeArr;
        int[] iArr;
        String[] strArr;
        String[] strArr2;
        long[] jArrC;
        long[] jArr2;
        int[] iArrA;
        int[] iArr2;
        int[] iArrA2;
        int[] iArr3;
        int[] iArrA3;
        int[] iArr4;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        String[] strArr7;
        int[] iArr5;
        String[] strArr8;
        String[] strArr9;
        String[] strArr10;
        String[] strArr11;
        String[] strArr12;
        String[] strArr13;
        boolean[] zArr;
        basd[] basdVarArr;
        basd[] basdVarArr2;
        ConversationIdType[] conversationIdTypeArr2;
        eyga[] eygaVarArr;
        String[] strArr14;
        eyga[] eygaVarArr2;
        boolean z;
        cpyi[] cpyiVarArr;
        String[] strArr15;
        long[] jArr3;
        int i;
        cpyi[] cpyiVarArr2;
        Iterator it;
        eyga eygaVar;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            int i2 = 0;
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet2 = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z2 = dqtmVar.b;
                if (!zDj) {
                    messageIdTypeArr = null;
                } else if (z2) {
                    long[] jArrDt = dt(getString(cO(0, azlc.a)));
                    int length2 = jArrDt.length;
                    MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                    for (int i3 = 0; i3 < length2; i3++) {
                        messageIdTypeArr2[i3] = new MessageIdType(jArrDt[i3]);
                    }
                    messageIdTypeArr = (MessageIdType[]) dqru.D(null, messageIdTypeArr2, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{p()};
                }
                dqqf.dA(length, messageIdTypeArr, new ejxr() { // from class: azjl
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                if (!dj(1)) {
                    optionalArr = null;
                } else if (z2) {
                    String[] strArrDu = du(getString(cO(1, azlc.a)));
                    int length3 = strArrDu.length;
                    Optional[] optionalArr2 = new Optional[length3];
                    for (int i4 = 0; i4 < length3; i4++) {
                        optionalArr2[i4] = basg.a(strArrDu[i4]);
                    }
                    optionalArr = (Optional[]) dqru.D(null, optionalArr2, new Optional[0]);
                } else {
                    optionalArr = new Optional[]{t()};
                }
                dqqf.dA(length, optionalArr, new ejxr() { // from class: azjn
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "message_persistence_id:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                if (!dj(2)) {
                    axcmVarArr = null;
                } else if (z2) {
                    String[] strArrDu2 = du(getString(cO(2, azlc.a)));
                    int length4 = strArrDu2.length;
                    axcm[] axcmVarArr2 = new axcm[length4];
                    for (int i5 = 0; i5 < length4; i5++) {
                        axcmVarArr2[i5] = axcn.a(strArrDu2[i5]);
                    }
                    axcmVarArr = (axcm[]) dqru.D(null, axcmVarArr2, new axcm[0]);
                } else {
                    axcmVarArr = new axcm[]{n()};
                }
                dqqf.dA(length, axcmVarArr, new ejxr() { // from class: azjz
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "my_identity:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                int[] iArrA4 = dj(3) ? z2 ? dqru.A(null, ds(getString(cO(3, azlc.a)))) : new int[]{e()} : null;
                dqqf.dy(length, iArrA4, new ejxr() { // from class: azka
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "message_status:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                boolean[] zArrE = dj(4) ? z2 ? dqru.E(null, dv(getString(cO(4, azlc.a)))) : new boolean[]{G()} : null;
                dqqf.dB(length, zArrE, new ejxr() { // from class: azkb
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "seen:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                boolean[] zArrE2 = dj(5) ? z2 ? dqru.E(null, dv(getString(cO(5, azlc.a)))) : new boolean[]{F()} : null;
                dqqf.dB(length, zArrE2, new ejxr() { // from class: azkc
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "read:".concat(String.valueOf(this.a.getString(5)));
                    }
                });
                if (!dj(6)) {
                    jArr = jArrDC;
                    hashSet = hashSet2;
                    conversationIdTypeArr = null;
                } else if (z2) {
                    long[] jArrDt2 = dt(getString(cO(6, azlc.a)));
                    int length5 = jArrDt2.length;
                    ConversationIdType[] conversationIdTypeArr3 = new ConversationIdType[length5];
                    int i6 = 0;
                    while (i6 < length5) {
                        conversationIdTypeArr3[i6] = new ConversationIdType(jArrDt2[i6]);
                        i6++;
                        hashSet2 = hashSet2;
                        jArrDC = jArrDC;
                        i2 = 0;
                    }
                    jArr = jArrDC;
                    hashSet = hashSet2;
                    conversationIdTypeArr = (ConversationIdType[]) dqru.D(null, conversationIdTypeArr3, new ConversationIdType[i2]);
                } else {
                    jArr = jArrDC;
                    hashSet = hashSet2;
                    conversationIdTypeArr = new ConversationIdType[]{o()};
                }
                dqqf.dA(length, conversationIdTypeArr, new ejxr() { // from class: azkd
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "conversation_id:".concat(String.valueOf(this.a.getString(6)));
                    }
                });
                int[] iArrA5 = dj(7) ? z2 ? dqru.A(null, ds(getString(cO(7, azlc.a)))) : new int[]{i()} : null;
                dqqf.dy(length, iArrA5, new ejxr() { // from class: azke
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "sender_participant_id:".concat(String.valueOf(this.a.getString(7)));
                    }
                });
                String[] strArr16 = dj(8) ? z2 ? (String[]) dqru.D(null, du(getString(cO(8, azlc.a))), new String[0]) : new String[]{C()} : null;
                dqqf.dA(length, strArr16, new ejxr() { // from class: azkf
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "sender_send_destination:".concat(String.valueOf(this.a.getString(8)));
                    }
                });
                String[] strArr17 = dj(9) ? z2 ? (String[]) dqru.D(null, du(getString(cO(9, azlc.a))), new String[0]) : new String[]{B()} : null;
                dqqf.dA(length, strArr17, new ejxr() { // from class: azkg
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "msisdn_receiving_rcs_message:".concat(String.valueOf(this.a.getString(9)));
                    }
                });
                int[] iArrA6 = dj(10) ? z2 ? dqru.A(null, ds(getString(cO(10, azlc.a)))) : new int[]{h()} : null;
                dqqf.dy(length, iArrA6, new ejxr() { // from class: azjw
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "self_participant_id:".concat(String.valueOf(this.a.getString(10)));
                    }
                });
                if (!dj(11)) {
                    iArr = iArrA5;
                    strArr = null;
                } else if (z2) {
                    iArr = iArrA5;
                    strArr = (String[]) dqru.D(null, du(getString(cO(11, azlc.a))), new String[0]);
                } else {
                    iArr = iArrA5;
                    strArr = new String[]{z()};
                }
                dqqf.dA(length, strArr, new ejxr() { // from class: azkh
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "mms_subject:".concat(String.valueOf(this.a.getString(11)));
                    }
                });
                long[] jArrC2 = dj(12) ? z2 ? dqru.C(null, dt(getString(cO(12, azlc.a)))) : new long[]{l()} : null;
                dqqf.dz(length, jArrC2, new ejxr() { // from class: azki
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "received_timestamp:".concat(String.valueOf(this.a.getString(12)));
                    }
                });
                if (!dj(13)) {
                    strArr2 = strArr;
                    jArrC = null;
                } else if (z2) {
                    strArr2 = strArr;
                    jArrC = dqru.C(null, dt(getString(cO(13, azlc.a))));
                } else {
                    strArr2 = strArr;
                    jArrC = new long[]{m()};
                }
                dqqf.dz(length, jArrC, new ejxr() { // from class: azkj
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "sent_timestamp:".concat(String.valueOf(this.a.getString(13)));
                    }
                });
                if (!dj(14)) {
                    jArr2 = jArrC;
                    iArrA = null;
                } else if (z2) {
                    jArr2 = jArrC;
                    iArrA = dqru.A(null, ds(getString(cO(14, azlc.a))));
                } else {
                    jArr2 = jArrC;
                    iArrA = new int[]{f()};
                }
                dqqf.dy(length, iArrA, new ejxr() { // from class: azkk
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "protocol:".concat(String.valueOf(this.a.getString(14)));
                    }
                });
                if (!dj(15)) {
                    iArr2 = iArrA;
                    iArrA2 = null;
                } else if (z2) {
                    iArr2 = iArrA;
                    iArrA2 = dqru.A(null, ds(getString(cO(15, azlc.a))));
                } else {
                    iArr2 = iArrA;
                    iArrA2 = new int[]{c()};
                }
                dqqf.dy(length, iArrA2, new ejxr() { // from class: azkl
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "message_priority:".concat(String.valueOf(this.a.getString(15)));
                    }
                });
                if (!dj(16)) {
                    iArr3 = iArrA2;
                    iArrA3 = null;
                } else if (z2) {
                    iArr3 = iArrA2;
                    iArrA3 = dqru.A(null, ds(getString(cO(16, azlc.a))));
                } else {
                    iArr3 = iArrA2;
                    iArrA3 = new int[]{g()};
                }
                dqqf.dy(length, iArrA3, new ejxr() { // from class: azkm
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "rcs_encryption_status:".concat(String.valueOf(this.a.getString(16)));
                    }
                });
                if (!dj(17)) {
                    iArr4 = iArrA3;
                    strArr3 = strArr17;
                    strArr4 = null;
                } else if (z2) {
                    iArr4 = iArrA3;
                    strArr3 = strArr17;
                    strArr4 = (String[]) dqru.D(null, du(getString(cO(17, azlc.a))), new String[0]);
                } else {
                    iArr4 = iArrA3;
                    strArr3 = strArr17;
                    strArr4 = new String[]{u()};
                }
                dqqf.dA(length, strArr4, new ejxr() { // from class: azkn
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "cloud_sync_id:".concat(String.valueOf(this.a.getString(17)));
                    }
                });
                if (!dj(18)) {
                    strArr5 = strArr4;
                    strArr6 = null;
                } else if (z2) {
                    strArr5 = strArr4;
                    strArr6 = (String[]) dqru.D(null, du(getString(cO(18, azlc.a))), new String[0]);
                } else {
                    strArr5 = strArr4;
                    strArr6 = new String[]{x()};
                }
                dqqf.dA(length, strArr6, new ejxr() { // from class: azko
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "correlation_id:".concat(String.valueOf(this.a.getString(18)));
                    }
                });
                int[] iArrA7 = dj(19) ? z2 ? dqru.A(null, ds(getString(cO(19, azlc.a)))) : new int[]{j()} : null;
                dqqf.dy(length, iArrA7, new ejxr() { // from class: azjm
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "sms_error_code:".concat(String.valueOf(this.a.getString(19)));
                    }
                });
                if (!dj(20)) {
                    strArr7 = strArr6;
                    iArr5 = iArrA7;
                    strArr8 = null;
                } else if (z2) {
                    strArr7 = strArr6;
                    iArr5 = iArrA7;
                    strArr8 = (String[]) dqru.D(null, du(getString(cO(20, azlc.a))), new String[0]);
                } else {
                    strArr7 = strArr6;
                    iArr5 = iArrA7;
                    strArr8 = new String[]{D()};
                }
                dqqf.dA(length, strArr8, new ejxr() { // from class: azjo
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "sms_error_desc_map_name:".concat(String.valueOf(this.a.getString(20)));
                    }
                });
                if (!dj(21)) {
                    strArr9 = strArr8;
                    strArr10 = null;
                } else if (z2) {
                    strArr9 = strArr8;
                    strArr10 = (String[]) dqru.D(null, du(getString(cO(21, azlc.a))), new String[0]);
                } else {
                    strArr9 = strArr8;
                    strArr10 = new String[]{A()};
                }
                dqqf.dA(length, strArr10, new ejxr() { // from class: azjp
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "mms_transaction_id:".concat(String.valueOf(this.a.getString(21)));
                    }
                });
                if (!dj(22)) {
                    strArr11 = strArr10;
                    strArr12 = null;
                } else if (z2) {
                    strArr11 = strArr10;
                    strArr12 = (String[]) dqru.D(null, du(getString(cO(22, azlc.a))), new String[0]);
                } else {
                    strArr11 = strArr10;
                    strArr12 = new String[]{y()};
                }
                dqqf.dA(length, strArr12, new ejxr() { // from class: azjq
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "mms_content_location:".concat(String.valueOf(this.a.getString(22)));
                    }
                });
                boolean[] zArrE3 = dj(23) ? z2 ? dqru.E(null, dv(getString(cO(23, azlc.a)))) : new boolean[]{E()} : null;
                dqqf.dB(length, zArrE3, new ejxr() { // from class: azjr
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "is_hidden:".concat(String.valueOf(this.a.getString(23)));
                    }
                });
                if (!dj(24)) {
                    strArr13 = strArr12;
                    zArr = zArrE3;
                    basdVarArr = null;
                } else if (z2) {
                    strArr13 = strArr12;
                    String[] strArrDu3 = du(getString(cO(24, azlc.a)));
                    int length6 = strArrDu3.length;
                    basd[] basdVarArr3 = new basd[length6];
                    zArr = zArrE3;
                    for (int i7 = 0; i7 < length6; i7++) {
                        basdVarArr3[i7] = basd.a(strArrDu3[i7]);
                    }
                    basdVarArr = (basd[]) dqru.D(null, basdVarArr3, new basd[0]);
                } else {
                    strArr13 = strArr12;
                    zArr = zArrE3;
                    basdVarArr = new basd[]{q()};
                }
                dqqf.dA(length, basdVarArr, new ejxr() { // from class: azjs
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "rcs_message_id:".concat(String.valueOf(this.a.getString(24)));
                    }
                });
                if (!dj(25)) {
                    basdVarArr2 = basdVarArr;
                    conversationIdTypeArr2 = conversationIdTypeArr;
                    eygaVarArr = null;
                } else if (z2) {
                    List listDf = df(getString(cO(25, azlc.a)));
                    eyga[] eygaVarArr3 = new eyga[listDf.size()];
                    Iterator it2 = listDf.iterator();
                    int i8 = 0;
                    while (it2.hasNext()) {
                        basd[] basdVarArr4 = basdVarArr;
                        try {
                            byte[] bArrZ = dqru.z((String) it2.next());
                            int i9 = i8 + 1;
                            if (bArrZ == null) {
                                it = it2;
                                eygaVar = null;
                            } else {
                                it = it2;
                                try {
                                    eygaVar = (eyga) evsn.parseFrom(eyga.a, bArrZ);
                                } catch (Throwable unused) {
                                    i8 = i9;
                                    eygaVarArr3[i8] = null;
                                    i8++;
                                    basdVarArr = basdVarArr4;
                                    it2 = it;
                                }
                            }
                            eygaVarArr3[i8] = eygaVar;
                            i8 = i9;
                        } catch (Throwable unused2) {
                            it = it2;
                        }
                        basdVarArr = basdVarArr4;
                        it2 = it;
                    }
                    basdVarArr2 = basdVarArr;
                    conversationIdTypeArr2 = conversationIdTypeArr;
                    eygaVarArr = (eyga[]) dqru.D(null, eygaVarArr3, new eyga[0]);
                } else {
                    basdVarArr2 = basdVarArr;
                    conversationIdTypeArr2 = conversationIdTypeArr;
                    eygaVarArr = new eyga[]{s()};
                }
                dqqf.dA(length, eygaVarArr, new ejxr() { // from class: azjt
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "custom_headers:".concat(String.valueOf(this.a.getString(25)));
                    }
                });
                String[] strArr18 = dj(26) ? z2 ? (String[]) dqru.D(null, du(getString(cO(26, azlc.a))), new String[0]) : new String[]{w()} : null;
                dqqf.dA(length, strArr18, new ejxr() { // from class: azju
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "cms_id:".concat(String.valueOf(this.a.getString(26)));
                    }
                });
                if (dj(27)) {
                    if (z2) {
                        int[] iArrDs = ds(getString(cO(27, azlc.a)));
                        cpyi[] cpyiVarArrValues = cpyi.values();
                        strArr14 = strArr18;
                        int length7 = cpyiVarArrValues.length;
                        cpyi[] cpyiVarArr3 = new cpyi[iArrDs.length];
                        eygaVarArr2 = eygaVarArr;
                        z = z2;
                        for (int i10 = 0; i10 < iArrDs.length; i10++) {
                            int i11 = iArrDs[i10];
                            if (i11 >= length7) {
                                throw new IllegalStateException();
                            }
                            cpyiVarArr3[i10] = cpyiVarArrValues[i11];
                        }
                        cpyiVarArr2 = (cpyi[]) dqru.D(null, cpyiVarArr3, new cpyi[0]);
                    } else {
                        strArr14 = strArr18;
                        eygaVarArr2 = eygaVarArr;
                        z = z2;
                        cpyiVarArr2 = new cpyi[]{r()};
                    }
                    cpyiVarArr = cpyiVarArr2;
                } else {
                    strArr14 = strArr18;
                    eygaVarArr2 = eygaVarArr;
                    z = z2;
                    cpyiVarArr = null;
                }
                dqqf.dA(length, cpyiVarArr, new ejxr() { // from class: azjv
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "cms_life_cycle:".concat(String.valueOf(this.a.getString(27)));
                    }
                });
                String[] strArr19 = dj(28) ? z ? (String[]) dqru.D(null, du(getString(cO(28, azlc.a))), new String[0]) : new String[]{v()} : null;
                dqqf.dA(length, strArr19, new ejxr() { // from class: azjx
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "cms_correlation_id:".concat(String.valueOf(this.a.getString(28)));
                    }
                });
                long[] jArrC3 = dj(29) ? z ? dqru.C(null, dt(getString(cO(29, azlc.a)))) : new long[]{k()} : null;
                dqqf.dz(length, jArrC3, new ejxr() { // from class: azjy
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "cms_last_mod_seq:".concat(String.valueOf(this.a.getString(29)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                int i12 = 0;
                while (i12 < length) {
                    long j = jArr[i12];
                    if (j > 0) {
                        strArr15 = strArr19;
                        HashSet hashSet3 = hashSet;
                        if (hashSet3.contains(Long.valueOf(j))) {
                            hashSet = hashSet3;
                        } else {
                            hashSet3.add(Long.valueOf(jArr[i12]));
                            String[] strArr20 = azlc.a;
                            azgv azgvVar = new azgv();
                            azgvVar.aF();
                            azgvVar.aD();
                            long j2 = jArr[i12];
                            hashSet = hashSet3;
                            if (messageIdTypeArr != null) {
                                MessageIdType messageIdType = messageIdTypeArr[i12];
                                i = length;
                                azgvVar.aE(0);
                                azgvVar.a = messageIdType;
                            } else {
                                i = length;
                            }
                            if (optionalArr != null) {
                                Optional optional = optionalArr[i12];
                                int i13 = azgvVar.aB;
                                jArr3 = jArrC3;
                                if (i13 < 120) {
                                    dqru.x("message_persistence_id", i13);
                                }
                                azgvVar.aE(1);
                                azgvVar.b = optional;
                            } else {
                                jArr3 = jArrC3;
                            }
                            if (axcmVarArr != null) {
                                axcm axcmVar = axcmVarArr[i12];
                                int i14 = azgvVar.aB;
                                if (i14 < 110) {
                                    dqru.x("my_identity", i14);
                                }
                                azgvVar.aE(2);
                                azgvVar.c = axcmVar;
                            }
                            if (iArrA4 != null) {
                                int i15 = iArrA4[i12];
                                azgvVar.aE(3);
                                azgvVar.d = i15;
                            }
                            if (zArrE != null) {
                                boolean z3 = zArrE[i12];
                                azgvVar.aE(4);
                                azgvVar.e = z3;
                            }
                            if (zArrE2 != null) {
                                boolean z4 = zArrE2[i12];
                                azgvVar.aE(5);
                                azgvVar.f = z4;
                            }
                            if (conversationIdTypeArr2 != null) {
                                ConversationIdType conversationIdType = conversationIdTypeArr2[i12];
                                azgvVar.aE(6);
                                azgvVar.g = conversationIdType;
                            }
                            if (iArr != null) {
                                int i16 = iArr[i12];
                                azgvVar.aE(7);
                                azgvVar.h = i16;
                            }
                            if (strArr16 != null) {
                                String str = strArr16[i12];
                                int i17 = azgvVar.aB;
                                if (i17 < 80) {
                                    dqru.x("sender_send_destination", i17);
                                }
                                azgvVar.aE(8);
                                azgvVar.i = str;
                            }
                            if (strArr3 != null) {
                                String str2 = strArr3[i12];
                                int i18 = azgvVar.aB;
                                if (i18 < 80) {
                                    dqru.x("msisdn_receiving_rcs_message", i18);
                                }
                                azgvVar.aE(9);
                                azgvVar.j = str2;
                            }
                            if (iArrA6 != null) {
                                int i19 = iArrA6[i12];
                                azgvVar.aE(10);
                                azgvVar.k = i19;
                            }
                            if (strArr2 != null) {
                                String str3 = strArr2[i12];
                                azgvVar.aE(11);
                                azgvVar.l = str3;
                            }
                            if (jArrC2 != null) {
                                long j3 = jArrC2[i12];
                                azgvVar.aE(12);
                                azgvVar.m = j3;
                            }
                            if (jArr2 != null) {
                                long j4 = jArr2[i12];
                                azgvVar.aE(13);
                                azgvVar.n = j4;
                            }
                            if (iArr2 != null) {
                                int i20 = iArr2[i12];
                                azgvVar.aE(14);
                                azgvVar.o = i20;
                            }
                            if (iArr3 != null) {
                                int i21 = iArr3[i12];
                                azgvVar.aE(15);
                                azgvVar.p = i21;
                            }
                            if (iArr4 != null) {
                                int i22 = iArr4[i12];
                                azgvVar.aE(16);
                                azgvVar.q = i22;
                            }
                            if (strArr5 != null) {
                                String str4 = strArr5[i12];
                                azgvVar.aE(17);
                                azgvVar.r = str4;
                            }
                            if (strArr7 != null) {
                                String str5 = strArr7[i12];
                                azgvVar.aE(18);
                                azgvVar.s = str5;
                            }
                            if (iArr5 != null) {
                                int i23 = iArr5[i12];
                                azgvVar.aE(19);
                                azgvVar.t = i23;
                            }
                            if (strArr9 != null) {
                                String str6 = strArr9[i12];
                                azgvVar.aE(20);
                                azgvVar.u = str6;
                            }
                            if (strArr11 != null) {
                                String str7 = strArr11[i12];
                                azgvVar.aE(21);
                                azgvVar.v = str7;
                            }
                            if (strArr13 != null) {
                                String str8 = strArr13[i12];
                                azgvVar.aE(22);
                                azgvVar.w = str8;
                            }
                            if (zArr != null) {
                                boolean z5 = zArr[i12];
                                azgvVar.aE(23);
                                azgvVar.x = z5;
                            }
                            if (basdVarArr2 != null) {
                                basd basdVar = basdVarArr2[i12];
                                azgvVar.aE(24);
                                azgvVar.y = basdVar;
                            }
                            if (eygaVarArr2 != null) {
                                eyga eygaVar2 = eygaVarArr2[i12];
                                int i24 = azgvVar.aB;
                                if (i24 < 50) {
                                    dqru.x("custom_headers", i24);
                                }
                                azgvVar.aE(25);
                                azgvVar.z = eygaVar2;
                            }
                            if (strArr14 != null) {
                                String str9 = strArr14[i12];
                                azgvVar.aE(26);
                                azgvVar.A = str9;
                            }
                            if (cpyiVarArr != null) {
                                cpyi cpyiVar = cpyiVarArr[i12];
                                azgvVar.aE(27);
                                azgvVar.B = cpyiVar;
                            }
                            if (strArr15 != null) {
                                String str10 = strArr15[i12];
                                azgvVar.aE(28);
                                azgvVar.C = str10;
                            }
                            if (jArr3 != null) {
                                long j5 = jArr3[i12];
                                azgvVar.aE(29);
                                azgvVar.D = j5;
                            }
                            azgt azgtVar = new azgt();
                            azgtVar.aD(azgvVar.aB());
                            azgtVar.a = azgvVar.a;
                            azgtVar.b = azgvVar.b;
                            azgtVar.c = azgvVar.c;
                            azgtVar.d = azgvVar.d;
                            azgtVar.e = azgvVar.e;
                            azgtVar.f = azgvVar.f;
                            azgtVar.g = azgvVar.g;
                            azgtVar.h = azgvVar.h;
                            azgtVar.i = azgvVar.i;
                            azgtVar.j = azgvVar.j;
                            azgtVar.k = azgvVar.k;
                            azgtVar.l = azgvVar.l;
                            azgtVar.m = azgvVar.m;
                            azgtVar.n = azgvVar.n;
                            azgtVar.o = azgvVar.o;
                            azgtVar.p = azgvVar.p;
                            azgtVar.q = azgvVar.q;
                            azgtVar.r = azgvVar.r;
                            azgtVar.s = azgvVar.s;
                            azgtVar.t = azgvVar.t;
                            azgtVar.u = azgvVar.u;
                            azgtVar.v = azgvVar.v;
                            azgtVar.w = azgvVar.w;
                            azgtVar.x = azgvVar.x;
                            azgtVar.y = azgvVar.y;
                            azgtVar.z = azgvVar.z;
                            azgtVar.A = azgvVar.A;
                            azgtVar.B = azgvVar.B;
                            azgtVar.C = azgvVar.C;
                            azgtVar.D = azgvVar.D;
                            azgtVar.cM = azgvVar.aC();
                            ekfwVar.h(azgtVar);
                            i12++;
                            strArr19 = strArr15;
                            length = i;
                            jArrC3 = jArr3;
                        }
                    } else {
                        strArr15 = strArr19;
                    }
                    i = length;
                    jArr3 = jArrC3;
                    i12++;
                    strArr19 = strArr15;
                    length = i;
                    jArrC3 = jArr3;
                }
                return ekfwVar.g();
            }
        }
        int i25 = ekgb.d;
        return ekoe.a;
    }

    public final int g() {
        return getInt(cO(16, azlc.a));
    }

    public final int h() {
        return getInt(cO(10, azlc.a));
    }

    public final int i() {
        return getInt(cO(7, azlc.a));
    }

    public final int j() {
        return getInt(cO(19, azlc.a));
    }

    public final long k() {
        return getLong(cO(29, azlc.a));
    }

    public final long l() {
        return getLong(cO(12, azlc.a));
    }

    public final long m() {
        return getLong(cO(13, azlc.a));
    }

    public final axcm n() {
        return axcn.a(getString(cO(2, azlc.a)));
    }

    public final ConversationIdType o() {
        return new ConversationIdType(getLong(cO(6, azlc.a)));
    }

    public final MessageIdType p() {
        return new MessageIdType(getLong(cO(0, azlc.a)));
    }

    public final basd q() {
        return basd.a(getString(cO(24, azlc.a)));
    }

    public final cpyi r() {
        cpyi[] cpyiVarArrValues = cpyi.values();
        int i = getInt(cO(27, azlc.a));
        if (i < cpyiVarArrValues.length) {
            return cpyiVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final eyga s() {
        byte[] blob = getBlob(cO(25, azlc.a));
        if (blob == null) {
            return null;
        }
        try {
            return (eyga) evsn.parseFrom(eyga.a, blob, evrr.a());
        } catch (Throwable unused) {
            return eyga.a;
        }
    }

    public final Optional t() {
        return basg.a(getString(cO(1, azlc.a)));
    }

    public final String u() {
        return getString(cO(17, azlc.a));
    }

    public final String v() {
        return getString(cO(28, azlc.a));
    }

    public final String w() {
        return getString(cO(26, azlc.a));
    }

    public final String x() {
        return getString(cO(18, azlc.a));
    }

    public final String y() {
        return getString(cO(22, azlc.a));
    }

    public final String z() {
        return getString(cO(11, azlc.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
