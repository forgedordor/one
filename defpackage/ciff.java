package defpackage;

import com.google.android.apps.messaging.shared.annotation.VisibleForGson;

/* compiled from: PG */
@VisibleForGson
/* loaded from: classes8.dex */
public final class ciff {
    private final Boolean isFi;
    private final String mcc;
    private final String mnc;
    private final String networkOperator;
    private final String operatorName;
    private final enwr rcsAvailability;
    private final int subId;
    private final String transportName;

    public /* synthetic */ ciff(String str, String str2, int i, enwr enwrVar, String str3, String str4, String str5, Boolean bool, fdbk fdbkVar) {
        this(str, str2, i, enwrVar, str3, str4, str5, bool);
    }

    /* renamed from: copy-Ot2XPwA$default, reason: not valid java name */
    public static /* synthetic */ ciff m244copyOt2XPwA$default(ciff ciffVar, String str, String str2, int i, enwr enwrVar, String str3, String str4, String str5, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = ciffVar.operatorName;
        }
        if ((i2 & 2) != 0) {
            str2 = ciffVar.networkOperator;
        }
        if ((i2 & 4) != 0) {
            i = ciffVar.subId;
        }
        if ((i2 & 8) != 0) {
            enwrVar = ciffVar.rcsAvailability;
        }
        if ((i2 & 16) != 0) {
            str3 = ciffVar.transportName;
        }
        if ((i2 & 32) != 0) {
            str4 = ciffVar.mcc;
        }
        if ((i2 & 64) != 0) {
            str5 = ciffVar.mnc;
        }
        if ((i2 & 128) != 0) {
            bool = ciffVar.isFi;
        }
        String str6 = str5;
        Boolean bool2 = bool;
        String str7 = str3;
        String str8 = str4;
        return ciffVar.m246copyOt2XPwA(str, str2, i, enwrVar, str7, str8, str6, bool2);
    }

    public final String component1() {
        return this.operatorName;
    }

    public final String component2() {
        return this.networkOperator;
    }

    /* renamed from: component3-zXW0w0o, reason: not valid java name */
    public final int m245component3zXW0w0o() {
        return this.subId;
    }

    public final enwr component4() {
        return this.rcsAvailability;
    }

    public final String component5() {
        return this.transportName;
    }

    public final String component6() {
        return this.mcc;
    }

    public final String component7() {
        return this.mnc;
    }

    public final Boolean component8() {
        return this.isFi;
    }

    /* renamed from: copy-Ot2XPwA, reason: not valid java name */
    public final ciff m246copyOt2XPwA(String str, String str2, int i, enwr enwrVar, String str3, String str4, String str5, Boolean bool) {
        str3.getClass();
        return new ciff(str, str2, i, enwrVar, str3, str4, str5, bool, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ciff)) {
            return false;
        }
        ciff ciffVar = (ciff) obj;
        return fdbq.f(this.operatorName, ciffVar.operatorName) && fdbq.f(this.networkOperator, ciffVar.networkOperator) && dggr.b(this.subId, ciffVar.subId) && this.rcsAvailability == ciffVar.rcsAvailability && fdbq.f(this.transportName, ciffVar.transportName) && fdbq.f(this.mcc, ciffVar.mcc) && fdbq.f(this.mnc, ciffVar.mnc) && fdbq.f(this.isFi, ciffVar.isFi);
    }

    public final String getMcc() {
        return this.mcc;
    }

    public final String getMnc() {
        return this.mnc;
    }

    public final String getNetworkOperator() {
        return this.networkOperator;
    }

    public final String getOperatorName() {
        return this.operatorName;
    }

    public final enwr getRcsAvailability() {
        return this.rcsAvailability;
    }

    /* renamed from: getSubId-zXW0w0o, reason: not valid java name */
    public final int m247getSubIdzXW0w0o() {
        return this.subId;
    }

    public final String getTransportName() {
        return this.transportName;
    }

    public int hashCode() {
        String str = this.operatorName;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.networkOperator;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = iHashCode * 31;
        int i2 = this.subId;
        enwr enwrVar = this.rcsAvailability;
        int iHashCode3 = (((((((i + iHashCode2) * 31) + i2) * 31) + (enwrVar == null ? 0 : enwrVar.hashCode())) * 31) + this.transportName.hashCode()) * 31;
        String str3 = this.mcc;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.mnc;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isFi;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isFi() {
        return this.isFi;
    }

    public String toString() {
        return "RcsFeedbackSimInfo(operatorName=" + this.operatorName + ", networkOperator=" + this.networkOperator + ", subId=" + dggr.a(this.subId) + ", rcsAvailability=" + this.rcsAvailability + ", transportName=" + this.transportName + ", mcc=" + this.mcc + ", mnc=" + this.mnc + ", isFi=" + this.isFi + ")";
    }

    private ciff(String str, String str2, int i, enwr enwrVar, String str3, String str4, String str5, Boolean bool) {
        str3.getClass();
        this.operatorName = str;
        this.networkOperator = str2;
        this.subId = i;
        this.rcsAvailability = enwrVar;
        this.transportName = str3;
        this.mcc = str4;
        this.mnc = str5;
        this.isFi = bool;
    }
}
