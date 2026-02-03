package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.LinkedHashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwtp {
    public static final fctc a;
    public static final bwtp b;
    public static final bwtp c;
    public static final bwtp d;
    public static final bwtp e;
    public static final bwtp f;
    public static final bwtp g;
    public static final bwtp h;
    public static final bwtp i;
    public static final bwtp j;
    public static final bwtp k;
    private static final /* synthetic */ bwtp[] m;
    public final int l;

    static {
        bwtp bwtpVar = new bwtp("SELF_REMOVED_FROM_ENCRYPTED_GROUP", 0, 230);
        b = bwtpVar;
        bwtp bwtpVar2 = new bwtp("ENCRYPTED_GROUP_PARTICIPANT_LEFT", 1, 227);
        c = bwtpVar2;
        bwtp bwtpVar3 = new bwtp("ENCRYPTED_GROUP_SELF_LEFT", 2, 228);
        d = bwtpVar3;
        bwtp bwtpVar4 = new bwtp("ENCRYPTED_GROUP_PARTICIPANT_JOINED", 3, 225);
        e = bwtpVar4;
        bwtp bwtpVar5 = new bwtp("PARTICIPANT_REMOVED_FROM_ENCRYPTED_GROUP", 4, 231);
        f = bwtpVar5;
        bwtp bwtpVar6 = new bwtp("SELF_REMOVED_FROM_GROUP", 5, 220);
        g = bwtpVar6;
        bwtp bwtpVar7 = new bwtp("PARTICIPANT_LEFT", 6, BasePaymentResult.ERROR_REQUEST_TIMEOUT);
        h = bwtpVar7;
        bwtp bwtpVar8 = new bwtp("SELF_LEFT", 7, BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED);
        i = bwtpVar8;
        bwtp bwtpVar9 = new bwtp("PARTICIPANT_JOINED", 8, BasePaymentResult.ERROR_REQUEST_FAILED);
        j = bwtpVar9;
        bwtp bwtpVar10 = new bwtp("PARTICIPANT_REMOVED_FROM_GROUP", 9, 221);
        k = bwtpVar10;
        bwtp[] bwtpVarArr = {bwtpVar, bwtpVar2, bwtpVar3, bwtpVar4, bwtpVar5, bwtpVar6, bwtpVar7, bwtpVar8, bwtpVar9, bwtpVar10};
        m = bwtpVarArr;
        fczb.a(bwtpVarArr);
        a = fctd.a(new fdae() { // from class: bwto
            @Override // defpackage.fdae
            public final Object invoke() {
                bwtp[] bwtpVarArrValues = bwtp.values();
                LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(bwtpVarArrValues.length), 16));
                for (bwtp bwtpVar11 : bwtpVarArrValues) {
                    linkedHashMap.put(Integer.valueOf(bwtpVar11.l), bwtpVar11);
                }
                return linkedHashMap;
            }
        });
    }

    private bwtp(String str, int i2, int i3) {
        this.l = i3;
    }

    public static bwtp[] values() {
        return (bwtp[]) m.clone();
    }
}
