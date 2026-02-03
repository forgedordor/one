package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.LinkedHashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwtr {
    public static final fctc a;
    public static final bwtr b;
    public static final bwtr c;
    public static final bwtr d;
    public static final bwtr e;
    public static final bwtr f;
    private static final /* synthetic */ bwtr[] h;
    public final int g;

    static {
        bwtr bwtrVar = new bwtr("RCS_GROUP_CREATED", 0, BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED);
        b = bwtrVar;
        bwtr bwtrVar2 = new bwtr("ENCRYPTED_GROUP_CREATED", 1, 229);
        c = bwtrVar2;
        bwtr bwtrVar3 = new bwtr("PARTICIPANT_JOINED", 2, BasePaymentResult.ERROR_REQUEST_FAILED);
        d = bwtrVar3;
        bwtr bwtrVar4 = new bwtr("ENCRYPTED_GROUP_PARTICIPANT_JOINED", 3, 225);
        e = bwtrVar4;
        bwtr bwtrVar5 = new bwtr("ENCRYPTED_GROUP_PARTICIPANT_JOINED_INFO", 4, 226);
        f = bwtrVar5;
        bwtr[] bwtrVarArr = {bwtrVar, bwtrVar2, bwtrVar3, bwtrVar4, bwtrVar5};
        h = bwtrVarArr;
        fczb.a(bwtrVarArr);
        a = fctd.a(new fdae() { // from class: bwtq
            @Override // defpackage.fdae
            public final Object invoke() {
                bwtr[] bwtrVarArrValues = bwtr.values();
                LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(bwtrVarArrValues.length), 16));
                for (bwtr bwtrVar6 : bwtrVarArrValues) {
                    linkedHashMap.put(Integer.valueOf(bwtrVar6.g), bwtrVar6);
                }
                return linkedHashMap;
            }
        });
    }

    private bwtr(String str, int i, int i2) {
        this.g = i2;
    }

    public static bwtr[] values() {
        return (bwtr[]) h.clone();
    }

    public final bwsn a() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3 && iOrdinal != 4) {
                        throw null;
                    }
                }
            }
            return bwsn.d;
        }
        return bwsn.c;
    }
}
