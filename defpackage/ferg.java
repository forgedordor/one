package defpackage;

import j$.time.ZoneId;
import j$.util.DesugarTimeZone;
import j$.util.TimeZoneRetargetInterface;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ferg extends TimeZone implements TimeZoneRetargetInterface {
    private static final long serialVersionUID = -5620979316746547234L;
    private final fesp a;
    private final int b;

    protected ferg() {
        this.a = null;
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ferg fergVar = (ferg) obj;
        if (this.b != fergVar.b) {
            return false;
        }
        fesp fespVar = this.a;
        return fespVar == null ? fergVar.a == null : fespVar.equals(fergVar.a);
    }

    @Override // java.util.TimeZone
    public final int getOffset(int i, int i2, int i3, int i4, int i5, int i6) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(0, i);
        calendar.set(1, i2);
        calendar.set(2, i3);
        calendar.set(6, i4);
        calendar.set(7, i5);
        calendar.set(14, i6);
        ferq ferqVarC = this.a.c(new fenh(calendar.getTime()));
        if (ferqVarC != null) {
            return (int) ((fewj) ferqVarC.a("TZOFFSETTO")).c.a;
        }
        return 0;
    }

    @Override // java.util.TimeZone
    public final int getRawOffset() {
        return this.b;
    }

    public final int hashCode() {
        fesp fespVar = this.a;
        return ((fespVar != null ? fespVar.hashCode() : 0) * 31) + this.b;
    }

    @Override // java.util.TimeZone
    public final boolean inDaylightTime(Date date) {
        ferq ferqVarC = this.a.c(new fenh(date));
        return ferqVarC != null && (ferqVarC instanceof ferp);
    }

    @Override // java.util.TimeZone
    public final void setRawOffset(int i) {
        throw new UnsupportedOperationException("Updates to the VTIMEZONE object must be performed directly");
    }

    @Override // java.util.TimeZone, j$.util.TimeZoneRetargetInterface
    public final /* synthetic */ ZoneId toZoneId() {
        return DesugarTimeZone.toZoneId(this);
    }

    @Override // java.util.TimeZone
    public final boolean useDaylightTime() {
        return !this.a.c.a("DAYLIGHT").isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0030 A[PHI: r0
      0x0030: PHI (r0v6 fenb) = (r0v5 fenb), (r0v9 fenb) binds: [B:3:0x001f, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ferg(defpackage.fesp r9) {
        /*
            r8 = this;
            r8.<init>()
            r8.a = r9
            java.lang.String r0 = "TZID"
            feou r0 = r9.a(r0)
            fewg r0 = (defpackage.fewg) r0
            java.lang.String r0 = r0.c
            r8.setID(r0)
            fenb r0 = r9.c
            java.lang.String r1 = "STANDARD"
            fenb r0 = r0.a(r1)
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto L30
            fenb r9 = r9.c
            java.lang.String r0 = "DAYLIGHT"
            fenb r0 = r9.a(r0)
            boolean r9 = r0.isEmpty()
            if (r9 == 0) goto L30
            goto L77
        L30:
            int r9 = r0.size()
            r1 = 1
            if (r9 <= r1) goto L5f
            fenh r9 = new fenh
            r9.<init>()
            r1 = 0
            r3 = r1
            r4 = r2
        L3f:
            int r5 = r0.size()
            if (r4 >= r5) goto L66
            java.lang.Object r5 = r0.get(r4)
            ferq r5 = (defpackage.ferq) r5
            fend r6 = r5.c(r9)
            if (r6 != 0) goto L52
            goto L5c
        L52:
            if (r3 == 0) goto L5a
            boolean r7 = r6.after(r3)
            if (r7 == 0) goto L5c
        L5a:
            r1 = r5
            r3 = r6
        L5c:
            int r4 = r4 + 1
            goto L3f
        L5f:
            java.lang.Object r9 = r0.get(r2)
            r1 = r9
            ferq r1 = (defpackage.ferq) r1
        L66:
            if (r1 == 0) goto L77
            java.lang.String r9 = "TZOFFSETTO"
            feou r9 = r1.a(r9)
            fewj r9 = (defpackage.fewj) r9
            if (r9 == 0) goto L77
            ferk r9 = r9.c
            long r0 = r9.a
            int r2 = (int) r0
        L77:
            r8.b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ferg.<init>(fesp):void");
    }

    @Override // java.util.TimeZone
    public final int getOffset(long j) {
        ferq ferqVarC = this.a.c(new fenh(j));
        if (ferqVarC == null) {
            return 0;
        }
        long j2 = ((fewj) ferqVarC.a("TZOFFSETTO")).c.a;
        int i = this.b;
        return j2 < ((long) i) ? i : (int) j2;
    }
}
