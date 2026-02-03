package defpackage;

import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bnxc extends dqqf implements bnwp {
    @Deprecated
    public bnxc(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bnxg bnxgVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bnxi.a, dqwjVar, dqtmVar, bnxgVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bnvj();
    }

    public final int c() {
        return getInt(cO(2, bnxi.a));
    }

    public final int e() {
        return getInt(cO(10, bnxi.a));
    }

    public final int f() {
        return getInt(cO(11, bnxi.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        ConversationIdType[] conversationIdTypeArr;
        int[] iArr;
        MessageIdType[] messageIdTypeArr;
        String[] strArr;
        Uri[] uriArr;
        int i;
        long[] jArrC;
        int[] iArrA;
        int[] iArrA2;
        int i2;
        long[] jArr;
        MessageIdType[] messageIdTypeArr2;
        int i3;
        long[] jArr2;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length == 0 || (length == 1 && jArrDC[0] == -1)) {
            int i4 = ekgb.d;
            return ekoe.a;
        }
        HashSet hashSet = new HashSet();
        dqtm dqtmVar = this.d;
        boolean zDj = dj(0);
        boolean z = dqtmVar.b;
        long[] jArrC2 = zDj ? z ? dqru.C(null, dt(getString(cO(0, bnxi.a)))) : new long[]{h()} : null;
        dqqf.dz(length, jArrC2, new ejxr() { // from class: bnwq
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        if (!dj(1)) {
            conversationIdTypeArr = null;
        } else if (z) {
            long[] jArrDt = dt(getString(cO(1, bnxi.a)));
            int length2 = jArrDt.length;
            ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
            for (int i5 = 0; i5 < length2; i5++) {
                conversationIdTypeArr2[i5] = new ConversationIdType(jArrDt[i5]);
            }
            conversationIdTypeArr = (ConversationIdType[]) dqru.D(null, conversationIdTypeArr2, new ConversationIdType[0]);
        } else {
            conversationIdTypeArr = new ConversationIdType[]{k()};
        }
        dqqf.dA(length, conversationIdTypeArr, new ejxr() { // from class: bnwv
            @Override // defpackage.ejxr
            public final Object get() {
                return "conversation_id:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        int[] iArrA3 = dj(2) ? z ? dqru.A(null, ds(getString(cO(2, bnxi.a)))) : new int[]{c()} : null;
        dqqf.dy(length, iArrA3, new ejxr() { // from class: bnww
            @Override // defpackage.ejxr
            public final Object get() {
                return "label:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        if (!dj(3)) {
            iArr = iArrA3;
            messageIdTypeArr = null;
        } else if (z) {
            long[] jArrDt2 = dt(getString(cO(3, bnxi.a)));
            int length3 = jArrDt2.length;
            MessageIdType[] messageIdTypeArr3 = new MessageIdType[length3];
            int i6 = 0;
            while (i6 < length3) {
                messageIdTypeArr3[i6] = new MessageIdType(jArrDt2[i6]);
                i6++;
                iArrA3 = iArrA3;
            }
            iArr = iArrA3;
            messageIdTypeArr = (MessageIdType[]) dqru.D(null, messageIdTypeArr3, new MessageIdType[0]);
        } else {
            iArr = iArrA3;
            messageIdTypeArr = new MessageIdType[]{l()};
        }
        dqqf.dA(length, messageIdTypeArr, new ejxr() { // from class: bnwx
            @Override // defpackage.ejxr
            public final Object get() {
                return "message_id:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        if (!dj(4)) {
            strArr = null;
        } else if (z) {
            String[] strArrDu = du(getString(cO(4, bnxi.a)));
            for (int i7 = 0; i7 < strArrDu.length; i7++) {
                strArrDu[i7] = cssq.a(strArrDu[i7]);
            }
            strArr = (String[]) dqru.D(null, strArrDu, new String[0]);
        } else {
            strArr = new String[]{n()};
        }
        dqqf.dA(length, strArr, new ejxr() { // from class: bnwy
            @Override // defpackage.ejxr
            public final Object get() {
                return "snippet_text:".concat(String.valueOf(this.a.getString(4)));
            }
        });
        if (!dj(5)) {
            uriArr = null;
        } else if (z) {
            String[] strArrDu2 = du(getString(cO(5, bnxi.a)));
            int length4 = strArrDu2.length;
            Uri[] uriArr2 = new Uri[length4];
            int i8 = 0;
            int i9 = 0;
            while (i8 < length4) {
                String str = strArrDu2[i8];
                int i10 = i9 + 1;
                uriArr2[i9] = (str == null || str.length() == 0) ? null : Uri.parse(str);
                i8++;
                i9 = i10;
            }
            uriArr = (Uri[]) dqru.D(null, uriArr2, new Uri[0]);
        } else {
            uriArr = new Uri[]{j()};
        }
        dqqf.dA(length, uriArr, new ejxr() { // from class: bnwz
            @Override // defpackage.ejxr
            public final Object get() {
                return "preview_uri:".concat(String.valueOf(this.a.getString(5)));
            }
        });
        String[] strArr2 = dj(6) ? z ? (String[]) dqru.D(null, du(getString(cO(6, bnxi.a))), new String[0]) : new String[]{m()} : null;
        dqqf.dA(length, strArr2, new ejxr() { // from class: bnxa
            @Override // defpackage.ejxr
            public final Object get() {
                return "preview_content_type:".concat(String.valueOf(this.a.getString(6)));
            }
        });
        int[] iArrA4 = dj(7) ? z ? dqru.A(null, ds(getString(cO(7, bnxi.a)))) : new int[]{g()} : null;
        dqqf.dy(length, iArrA4, new ejxr() { // from class: bnxb
            @Override // defpackage.ejxr
            public final Object get() {
                return "message_status:".concat(String.valueOf(this.a.getString(7)));
            }
        });
        boolean[] zArrE = dj(8) ? z ? dqru.E(null, dv(getString(cO(8, bnxi.a)))) : new boolean[]{o()} : null;
        dqqf.dB(length, zArrE, new ejxr() { // from class: bnwr
            @Override // defpackage.ejxr
            public final Object get() {
                return "read:".concat(String.valueOf(this.a.getString(8)));
            }
        });
        if (!dj(9)) {
            i = 0;
            jArrC = null;
        } else if (z) {
            i = 0;
            jArrC = dqru.C(null, dt(getString(cO(9, bnxi.a))));
        } else {
            i = 0;
            jArrC = new long[]{i()};
        }
        dqqf.dz(length, jArrC, new ejxr() { // from class: bnws
            @Override // defpackage.ejxr
            public final Object get() {
                return "received_timestamp:".concat(String.valueOf(this.a.getString(9)));
            }
        });
        if (!dj(10)) {
            iArrA = null;
        } else if (z) {
            iArrA = dqru.A(null, ds(getString(cO(10, bnxi.a))));
        } else {
            iArrA = new int[1];
            iArrA[i] = e();
        }
        dqqf.dy(length, iArrA, new ejxr() { // from class: bnwt
            @Override // defpackage.ejxr
            public final Object get() {
                return "message_protocol:".concat(String.valueOf(this.a.getString(10)));
            }
        });
        if (!dj(11)) {
            iArrA2 = null;
        } else if (z) {
            iArrA2 = dqru.A(null, ds(getString(cO(11, bnxi.a))));
        } else {
            int[] iArr2 = new int[1];
            iArr2[i] = f();
            iArrA2 = iArr2;
        }
        dqqf.dy(length, iArrA2, new ejxr() { // from class: bnwu
            @Override // defpackage.ejxr
            public final Object get() {
                return "raw_telephony_status:".concat(String.valueOf(this.a.getString(11)));
            }
        });
        ekfw ekfwVar = new ekfw();
        int i11 = i;
        while (i11 < length) {
            long j = jArrDC[i11];
            if (j > 0) {
                i2 = i11;
                if (!hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(jArrDC[i2]));
                    String[] strArr3 = bnxi.a;
                    bnvl bnvlVar = new bnvl();
                    bnvlVar.aF();
                    bnvlVar.aD();
                    long j2 = jArrDC[i2];
                    jArr = jArrDC;
                    messageIdTypeArr2 = messageIdTypeArr;
                    if (jArrC2 != null) {
                        long j3 = jArrC2[i2];
                        i3 = length;
                        bnvlVar.aE(i);
                        bnvlVar.a = j3;
                    } else {
                        i3 = length;
                    }
                    if (conversationIdTypeArr != null) {
                        ConversationIdType conversationIdType = conversationIdTypeArr[i2];
                        bnvlVar.aE(1);
                        bnvlVar.b = conversationIdType;
                    }
                    if (iArr != null) {
                        int i12 = iArr[i2];
                        int i13 = bnvlVar.aB;
                        if (i13 < 53020) {
                            dqru.x(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL, i13);
                        }
                        bnvlVar.aE(2);
                        bnvlVar.c = i12;
                    }
                    if (messageIdTypeArr2 != null) {
                        MessageIdType messageIdType = messageIdTypeArr2[i2];
                        bnvlVar.aE(3);
                        bnvlVar.d = messageIdType;
                    }
                    if (strArr != null) {
                        String strA = strArr[i2];
                        int i14 = bnvlVar.aB;
                        if (i14 < 53010) {
                            dqru.x("snippet_text", i14);
                        }
                        bnvlVar.aE(4);
                        if (!bnvlVar.aC) {
                            strA = cssq.a(strA);
                        }
                        bnvlVar.e = strA;
                    }
                    if (uriArr != null) {
                        Uri uri = uriArr[i2];
                        int i15 = bnvlVar.aB;
                        if (i15 < 55040) {
                            dqru.x("preview_uri", i15);
                        }
                        bnvlVar.aE(5);
                        bnvlVar.f = uri;
                    }
                    if (strArr2 != null) {
                        String str2 = strArr2[i2];
                        int i16 = bnvlVar.aB;
                        if (i16 < 55040) {
                            dqru.x("preview_content_type", i16);
                        }
                        bnvlVar.aE(6);
                        bnvlVar.g = str2;
                    }
                    if (iArrA4 != null) {
                        int i17 = iArrA4[i2];
                        int i18 = bnvlVar.aB;
                        if (i18 < 57050) {
                            dqru.x("message_status", i18);
                        }
                        bnvlVar.aE(7);
                        bnvlVar.h = i17;
                    }
                    if (zArrE != null) {
                        boolean z2 = zArrE[i2];
                        int i19 = bnvlVar.aB;
                        if (i19 < 57050) {
                            dqru.x("read", i19);
                        }
                        bnvlVar.aE(8);
                        bnvlVar.i = z2;
                    }
                    if (jArrC != null) {
                        long j4 = jArrC[i2];
                        int i20 = bnvlVar.aB;
                        jArr2 = jArrC;
                        if (i20 < 57050) {
                            dqru.x("received_timestamp", i20);
                        }
                        bnvlVar.aE(9);
                        bnvlVar.j = j4;
                    } else {
                        jArr2 = jArrC;
                    }
                    if (iArrA != null) {
                        int i21 = iArrA[i2];
                        int i22 = bnvlVar.aB;
                        if (i22 < 57050) {
                            dqru.x("message_protocol", i22);
                        }
                        bnvlVar.aE(10);
                        bnvlVar.k = i21;
                    }
                    if (iArrA2 != null) {
                        int i23 = iArrA2[i2];
                        int i24 = bnvlVar.aB;
                        if (i24 < 57050) {
                            dqru.x("raw_telephony_status", i24);
                        }
                        bnvlVar.aE(11);
                        bnvlVar.l = i23;
                    }
                    bnvj bnvjVar = new bnvj();
                    bnvjVar.aD(bnvlVar.aB());
                    bnvjVar.a = bnvlVar.a;
                    bnvjVar.b = bnvlVar.b;
                    bnvjVar.c = bnvlVar.c;
                    bnvjVar.d = bnvlVar.d;
                    bnvjVar.e = bnvlVar.e;
                    bnvjVar.f = bnvlVar.f;
                    bnvjVar.g = bnvlVar.g;
                    bnvjVar.h = bnvlVar.h;
                    bnvjVar.i = bnvlVar.i;
                    bnvjVar.j = bnvlVar.j;
                    bnvjVar.k = bnvlVar.k;
                    bnvjVar.l = bnvlVar.l;
                    bnvjVar.cM = bnvlVar.aC();
                    ekfwVar.h(bnvjVar);
                }
                i11 = i2 + 1;
                jArrDC = jArr;
                messageIdTypeArr = messageIdTypeArr2;
                length = i3;
                jArrC = jArr2;
                i = 0;
            } else {
                i2 = i11;
            }
            jArr = jArrDC;
            messageIdTypeArr2 = messageIdTypeArr;
            i3 = length;
            jArr2 = jArrC;
            i11 = i2 + 1;
            jArrDC = jArr;
            messageIdTypeArr = messageIdTypeArr2;
            length = i3;
            jArrC = jArr2;
            i = 0;
        }
        return ekfwVar.g();
    }

    public final int g() {
        return getInt(cO(7, bnxi.a));
    }

    public final long h() {
        return getLong(cO(0, bnxi.a));
    }

    public final long i() {
        return getLong(cO(9, bnxi.a));
    }

    public final Uri j() {
        String string = getString(cO(5, bnxi.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final ConversationIdType k() {
        return new ConversationIdType(getLong(cO(1, bnxi.a)));
    }

    public final MessageIdType l() {
        return new MessageIdType(getLong(cO(3, bnxi.a)));
    }

    public final String m() {
        return getString(cO(6, bnxi.a));
    }

    public final String n() {
        return cssq.a(getString(cO(4, bnxi.a)));
    }

    public final boolean o() {
        return getInt(cO(8, bnxi.a)) == 1;
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
