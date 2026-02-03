package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.internal.DataCollectionIdentifierParcelable;
import com.google.android.gms.clearcut.internal.LogVerifierResultParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.phenotype.ExperimentTokens;
import defpackage.dbzw;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.eyei;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class LogEventParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LogEventParcelable> CREATOR = new dbzw();
    private static final String[] m = new String[0];
    public final PlayLoggerContext a;
    public final byte[] b;
    public final int[] c;
    public final String[] d;
    public final int[] e;
    public final byte[][] f;
    public final ExperimentTokens[] g;
    public final boolean h;
    public LogVerifierResultParcelable i;
    public final int j;
    public final DataCollectionIdentifierParcelable k;
    public final eyei l;
    private final String[] n;

    public LogEventParcelable(PlayLoggerContext playLoggerContext, eyei eyeiVar, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, ExperimentTokens[] experimentTokensArr, String[] strArr2, int i) {
        this.a = playLoggerContext;
        this.l = eyeiVar;
        this.b = bArr;
        this.c = iArr;
        this.d = strArr;
        this.e = iArr2;
        this.f = null;
        this.g = experimentTokensArr;
        this.h = true;
        this.n = strArr2;
        this.j = i;
        this.k = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LogEventParcelable) {
            LogEventParcelable logEventParcelable = (LogEventParcelable) obj;
            if (dclc.a(this.a, logEventParcelable.a) && Arrays.equals(this.b, logEventParcelable.b) && Arrays.equals(this.c, logEventParcelable.c) && Arrays.equals(this.d, logEventParcelable.d) && dclc.a(this.l, logEventParcelable.l) && Arrays.equals(this.e, logEventParcelable.e) && Arrays.deepEquals(this.f, logEventParcelable.f) && Arrays.equals(this.g, logEventParcelable.g) && Arrays.equals(this.n, logEventParcelable.n) && this.h == logEventParcelable.h && dclc.a(this.i, logEventParcelable.i) && this.j == logEventParcelable.j && dclc.a(this.k, logEventParcelable.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.l, this.e, this.f, this.g, Boolean.valueOf(this.h), this.n, this.i, Integer.valueOf(this.j), this.k});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.a);
        sb.append(", LogEventBytes: ");
        byte[] bArr = this.b;
        sb.append(bArr == null ? null : new String(bArr, StandardCharsets.UTF_8));
        sb.append(", TestCodes: ");
        sb.append(Arrays.toString(this.c));
        sb.append(", MendelPackages: ");
        sb.append(Arrays.toString(this.d));
        sb.append(", LogEvent: ");
        sb.append(this.l);
        sb.append(", , ExperimentIDs: ");
        sb.append(Arrays.toString(this.e));
        sb.append(", ExperimentTokens: ");
        sb.append(Arrays.deepToString(this.f));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(Arrays.toString(this.g));
        sb.append(", MendelPackagesToFilter: ");
        sb.append(Arrays.toString(this.n));
        sb.append("AddPhenotypeExperimentTokens: ");
        sb.append(this.h);
        sb.append(", LogVerifierResult: ");
        LogVerifierResultParcelable logVerifierResultParcelable = this.i;
        sb.append(logVerifierResultParcelable != null ? logVerifierResultParcelable.toString() : null);
        sb.append("EventCode: ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.k);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 2, this.a, i, false);
        dclw.f(parcel, 3, this.b, false);
        dclw.v(parcel, 4, this.c);
        dclw.C(parcel, 5, this.d);
        dclw.v(parcel, 6, this.e);
        dclw.q(parcel, 7, this.f);
        dclw.d(parcel, 8, this.h);
        dclw.E(parcel, 9, this.g, i);
        dclw.k(parcel, 11, this.i, i, false);
        String[] strArr = this.n;
        if (strArr == null) {
            strArr = m;
        }
        dclw.C(parcel, 12, strArr);
        dclw.i(parcel, 13, this.j);
        dclw.k(parcel, 14, this.k, i, false);
        dclw.c(parcel, iA);
    }

    public LogEventParcelable(PlayLoggerContext playLoggerContext, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, ExperimentTokens[] experimentTokensArr, LogVerifierResultParcelable logVerifierResultParcelable, String[] strArr2, int i, DataCollectionIdentifierParcelable dataCollectionIdentifierParcelable) {
        this.a = playLoggerContext;
        this.b = bArr;
        this.c = iArr;
        this.d = strArr;
        this.e = iArr2;
        this.f = bArr2;
        this.h = z;
        this.g = experimentTokensArr;
        this.i = logVerifierResultParcelable;
        this.n = strArr2;
        this.j = i;
        this.l = null;
        this.k = dataCollectionIdentifierParcelable;
    }
}
