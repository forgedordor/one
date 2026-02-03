package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.Locale;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class shu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<shu> CREATOR = new shv();
    public final byte[] A;
    public final int B;
    public final int C;
    public final long D;
    public final long E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final long N;
    public final int[] O;
    public final int P;
    public final int a;
    public final long b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final long k;
    public final long l;
    public final long m;
    public final long n;
    public final long o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final boolean t;
    public final int u;
    public final long v;
    public final double w;
    public final double x;
    public final int y;
    public final float z;

    public shu(int i, int i2, int i3, int i4, long j, int i5, int i6, int i7, long j2, long j3, long j4, long j5, long j6, long j7, int i8, int i9, int i10, int i11, boolean z, int i12, long j8, double d, double d2, int i13, float f, byte[] bArr, int i14, int i15, long j9, long j10, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, long j11, long j12, int[] iArr, int i24) {
        this.a = i;
        this.b = j12;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = j;
        this.g = i5;
        this.h = i6;
        this.i = i7;
        this.j = j2;
        this.k = j3;
        this.l = j4;
        this.m = j5;
        this.n = j6;
        this.o = j7;
        this.p = i8;
        this.q = i9;
        this.r = i10;
        this.s = i11;
        this.t = z;
        this.u = i12;
        this.v = j8;
        this.w = d;
        this.x = d2;
        this.y = i13;
        this.z = f;
        this.A = bArr;
        this.B = i14;
        this.C = i15;
        this.D = j9;
        this.E = j10;
        this.F = i16;
        this.G = i17;
        this.H = i18;
        this.I = i19;
        this.J = i20;
        this.K = i21;
        this.L = i22;
        this.M = i23;
        this.N = j11;
        this.O = iArr;
        this.P = i24;
    }

    public final String toString() {
        spv spvVar;
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("customerId", Integer.valueOf(this.a));
        ekgiVar.i("callingUserId", Long.valueOf(this.b));
        ekgiVar.i("featureType", Integer.valueOf(this.c));
        ekgiVar.i("featureVariant", Integer.valueOf(this.d));
        ekgiVar.i("status", Integer.valueOf(this.e));
        ekgiVar.i("inferenceLatencyTotalMillis", Long.valueOf(this.f));
        ekgiVar.i("numInputTokens", Integer.valueOf(this.g));
        ekgiVar.i("numOutputTokens", Integer.valueOf(this.h));
        ekgiVar.i("numDecodeSteps", Integer.valueOf(this.i));
        ekgiVar.i("inferenceServiceStartLatencyMillis", Long.valueOf(this.j));
        ekgiVar.i("inferenceApiCallHandlingLatencyMillis", Long.valueOf(this.k));
        ekgiVar.i("inferenceInputSafetyCheckLatencyMillis", Long.valueOf(this.l));
        ekgiVar.i("inferenceInputEncodingLatencyMillis", Long.valueOf(this.m));
        ekgiVar.i("inferenceOverallOutputLatencyMillis", Long.valueOf(this.n));
        ekgiVar.i("inferenceOutputSafetyCheckLatencyMillis", Long.valueOf(this.o));
        ekgiVar.i("inputSafetyCheckPolicyViolationType", Integer.valueOf(this.p));
        ekgiVar.i("inputSafetyCheckSuggestedActionType", Integer.valueOf(this.q));
        ekgiVar.i("outputSafetyCheckPolicyViolationType", Integer.valueOf(this.r));
        ekgiVar.i("outputSafetyCheckSuggestedActionType", Integer.valueOf(this.s));
        ekgiVar.i("isModelLoaded", Boolean.valueOf(this.t));
        ekgiVar.i("featureId", Integer.valueOf(this.u));
        ekgiVar.i("featureVersion", Integer.valueOf(this.M));
        ekgiVar.i("modelInferenceLatencyMillis", Long.valueOf(this.v));
        ekgiVar.i("outputTokensPerSecond", Double.valueOf(this.w));
        ekgiVar.i("inputTokensPerSecond", Double.valueOf(this.x));
        ekgiVar.i("numSamples", Integer.valueOf(this.y));
        ekgiVar.i("cannedResponsesRatio", Float.valueOf(this.z));
        try {
            spvVar = (spv) evsn.parseFrom(spv.a, this.A, evrr.a());
        } catch (evtj e) {
            Log.e("InferenceEventTraceResult", "Failed to parse SpeculativeDecodeStatistics proto", e);
            spvVar = spv.a;
        }
        StringBuilder sb = new StringBuilder("{drafter_id: ");
        sb.append(spvVar.b);
        sb.append(", drafter_time: ");
        evrj evrjVar = spvVar.d;
        if (evrjVar == null) {
            evrjVar = evrj.a;
        }
        sb.append(evrjVar.b);
        sb.append(", acceptance_rate: ");
        sb.append(spvVar.e);
        sb.append(", drafter_guesses_per_position: ");
        sb.append((String) Collection.EL.stream(spvVar.c).map(new Function() { // from class: sht
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                spt sptVar = (spt) obj;
                return String.format(Locale.getDefault(), "(%d, %d)", Integer.valueOf(sptVar.b), Integer.valueOf(sptVar.c));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
        sb.append("}");
        ekgiVar.i("speculativeDecodeStatistics", sb.toString());
        ekgiVar.i("numSuffixScoreFiltered", Integer.valueOf(this.B));
        ekgiVar.i("numPostDeduped", Integer.valueOf(this.C));
        ekgiVar.i("inferenceStatefulSuspensionLatencyMillis", Long.valueOf(this.D));
        ekgiVar.i("inferenceStatelessSuspensionLatencyMillis", Long.valueOf(this.E));
        ekgiVar.i("topCannedResponseIndex", Integer.valueOf(this.F));
        ekgiVar.i("inferenceStatefulSuspensionCount", Integer.valueOf(this.G));
        ekgiVar.i("inferenceStatefulResumptionCount", Integer.valueOf(this.H));
        ekgiVar.i("inferenceStatelessSuspensionCount", Integer.valueOf(this.I));
        ekgiVar.i("inferenceStatelessResumptionCount", Integer.valueOf(this.J));
        ekgiVar.i("requestKind", Integer.valueOf(this.K));
        ekgiVar.i("initialQueuePosition", Integer.valueOf(this.L));
        ekgiVar.i("inferenceStartTimestampMillis", Long.valueOf(this.N));
        ekgiVar.i("auxiliaryFileTypes", this.O);
        ekgiVar.i("callingAppUid", Integer.valueOf(this.P));
        return "InferenceEventTraceResult\n".concat(ekmi.g(ekgiVar.c()));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, i2);
        dclw.i(parcel, 2, this.c);
        dclw.i(parcel, 3, this.d);
        dclw.i(parcel, 4, this.e);
        dclw.j(parcel, 5, this.f);
        dclw.i(parcel, 6, this.g);
        dclw.i(parcel, 7, this.h);
        dclw.i(parcel, 8, this.i);
        dclw.j(parcel, 9, this.j);
        dclw.j(parcel, 10, this.k);
        dclw.j(parcel, 11, this.l);
        dclw.j(parcel, 12, this.m);
        dclw.j(parcel, 13, this.n);
        dclw.j(parcel, 14, this.o);
        dclw.i(parcel, 15, this.p);
        dclw.i(parcel, 16, this.q);
        dclw.i(parcel, 17, this.r);
        dclw.i(parcel, 18, this.s);
        dclw.d(parcel, 19, this.t);
        dclw.i(parcel, 20, this.u);
        dclw.j(parcel, 21, this.v);
        dclw.g(parcel, 22, this.w);
        dclw.g(parcel, 23, this.x);
        dclw.i(parcel, 24, this.y);
        dclw.h(parcel, 25, this.z);
        dclw.f(parcel, 26, this.A, false);
        dclw.i(parcel, 27, this.B);
        dclw.i(parcel, 28, this.C);
        dclw.j(parcel, 29, this.D);
        dclw.j(parcel, 30, this.E);
        dclw.i(parcel, 31, this.F);
        dclw.i(parcel, 32, this.G);
        dclw.i(parcel, 33, this.H);
        dclw.i(parcel, 34, this.I);
        dclw.i(parcel, 35, this.J);
        dclw.i(parcel, 36, this.K);
        dclw.i(parcel, 37, this.L);
        dclw.i(parcel, 38, this.M);
        dclw.j(parcel, 39, this.N);
        dclw.j(parcel, 40, this.b);
        dclw.v(parcel, 41, this.O);
        dclw.i(parcel, 42, this.P);
        dclw.c(parcel, iA);
    }
}
