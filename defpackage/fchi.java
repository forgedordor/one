package defpackage;

import io.grpc.Status;
import j$.util.DesugarCollections;
import java.text.ParseException;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fchi {
    static final fbnb a = new fbnb("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo", null);
    final Long b;
    final Boolean c;
    final Integer d;
    final Integer e;
    final fckq f;
    final fcdz g;

    public fchi(Map map, boolean z, int i, int i2) throws NumberFormatException, ParseException {
        boolean z2;
        long j;
        fckq fckqVar;
        fcdz fcdzVar;
        this.b = fcff.d(map, "timeout");
        this.c = fcff.a(map, "waitForReady");
        Integer numC = fcff.c(map, "maxResponseMessageBytes");
        this.d = numC;
        if (numC != null) {
            ejwl.f(numC.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", numC);
        }
        Integer numC2 = fcff.c(map, "maxRequestMessageBytes");
        this.e = numC2;
        if (numC2 != null) {
            ejwl.f(numC2.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", numC2);
        }
        Map mapI = z ? fcff.i(map, "retryPolicy") : null;
        if (mapI == null) {
            j = 0;
            fckqVar = null;
            z2 = true;
        } else {
            Integer numC3 = fcff.c(mapI, "maxAttempts");
            numC3.getClass();
            int iIntValue = numC3.intValue();
            ejwl.d(iIntValue >= 2, "maxAttempts must be greater than 1: %s", iIntValue);
            int iMin = Math.min(iIntValue, 5);
            Long lD = fcff.d(mapI, "initialBackoff");
            lD.getClass();
            long jLongValue = lD.longValue();
            ejwl.e(jLongValue > 0, "initialBackoffNanos must be greater than 0: %s", jLongValue);
            Long lD2 = fcff.d(mapI, "maxBackoff");
            lD2.getClass();
            z2 = true;
            long jLongValue2 = lD2.longValue();
            ejwl.e(jLongValue2 > 0, "maxBackoff must be greater than 0: %s", jLongValue2);
            Double dB = fcff.b(mapI, "backoffMultiplier");
            dB.getClass();
            double dDoubleValue = dB.doubleValue();
            j = 0;
            ejwl.f(dDoubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", dB);
            Long lD3 = fcff.d(mapI, "perAttemptRecvTimeout");
            ejwl.f(lD3 == null || lD3.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", lD3);
            Set setA = fcmg.a(mapI, "retryableStatusCodes");
            ejyb.b(setA != null, "%s is required in retry policy", "retryableStatusCodes");
            ejyb.b(!setA.contains(Status.Code.OK), "%s must not contain OK", "retryableStatusCodes");
            ejwl.b((lD3 == null && setA.isEmpty()) ? false : true, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            fckqVar = new fckq(iMin, jLongValue, jLongValue2, dDoubleValue, lD3, setA);
        }
        this.f = fckqVar;
        Map mapI2 = z ? fcff.i(map, "hedgingPolicy") : null;
        if (mapI2 == null) {
            fcdzVar = null;
        } else {
            Integer numC4 = fcff.c(mapI2, "maxAttempts");
            numC4.getClass();
            int iIntValue2 = numC4.intValue();
            ejwl.d(iIntValue2 >= 2 ? z2 : false, "maxAttempts must be greater than 1: %s", iIntValue2);
            int iMin2 = Math.min(iIntValue2, 5);
            Long lD4 = fcff.d(mapI2, "hedgingDelay");
            lD4.getClass();
            long jLongValue3 = lD4.longValue();
            ejwl.e(jLongValue3 >= j ? z2 : false, "hedgingDelay must not be negative: %s", jLongValue3);
            Set setA2 = fcmg.a(mapI2, "nonFatalStatusCodes");
            if (setA2 == null) {
                setA2 = DesugarCollections.unmodifiableSet(EnumSet.noneOf(Status.Code.class));
            } else {
                ejyb.b(!setA2.contains(Status.Code.OK), "%s must not contain OK", "nonFatalStatusCodes");
            }
            fcdzVar = new fcdz(iMin2, jLongValue3, setA2);
        }
        this.g = fcdzVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fchi)) {
            return false;
        }
        fchi fchiVar = (fchi) obj;
        return ejwh.a(this.b, fchiVar.b) && ejwh.a(this.c, fchiVar.c) && ejwh.a(this.d, fchiVar.d) && ejwh.a(this.e, fchiVar.e) && ejwh.a(this.f, fchiVar.f) && ejwh.a(this.g, fchiVar.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("timeoutNanos", this.b);
        ejwfVarB.b("waitForReady", this.c);
        ejwfVarB.b("maxInboundMessageSize", this.d);
        ejwfVarB.b("maxOutboundMessageSize", this.e);
        ejwfVarB.b("retryPolicy", this.f);
        ejwfVarB.b("hedgingPolicy", this.g);
        return ejwfVarB.toString();
    }
}
