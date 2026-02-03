package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfaj {
    public String a;
    public String d;
    public String e;
    public String g;
    public dfae h;
    public final boolean i;
    public boolean j;
    public final dfah b = new dfah(dfae.FULL);
    public dfal c = new dfal();
    public final List f = new ArrayList();

    public dfaj(dfae dfaeVar, String str, boolean z, boolean z2) {
        dezw dezwVar = dezw.PENDING;
        this.g = str;
        this.h = dfaeVar;
        this.i = z;
        this.j = z2;
    }

    private static Optional i(List list, String str, crmx crmxVar) {
        if (str == null) {
            return Optional.empty();
        }
        String strK = dhjv.k(str, crmxVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dezv dezvVar = (dezv) it.next();
            String str2 = dezvVar.j;
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(strK) && str2.contains(strK)) {
                return Optional.of(dezvVar);
            }
        }
        return Optional.empty();
    }

    private static boolean j(dezv dezvVar) {
        if (!dezvVar.c.b()) {
            return false;
        }
        if (dezvVar.f != dezu.DEPARTED) {
            if (dezvVar.f != dezu.FAILED) {
                return false;
            }
            Optional optional = dezvVar.g;
            if (optional.isEmpty() || ((dezr) optional.get()).a != 603) {
                return false;
            }
        }
        return true;
    }

    private static boolean k(dezv dezvVar) {
        if (dezvVar.c.b()) {
            return dezvVar.f == dezu.BOOTED || dezvVar.f == dezu.BUSY;
        }
        return false;
    }

    private static final void l(Optional optional, Optional optional2) {
        if (optional2.isEmpty() || !((dezv) optional2.get()).b()) {
            dhja.g("Invalid endpoint should not be in the update", new Object[0]);
            return;
        }
        if (k((dezv) optional2.get())) {
            dhja.g("Temporarily disconnected endpoint should not be in the update: %s", optional2);
            return;
        }
        if (optional.isEmpty()) {
            if (((dezv) optional2.get()).c.a() || j((dezv) optional2.get())) {
                optional2.get();
                return;
            }
            return;
        }
        dezw dezwVar = ((dezv) optional.get()).c;
        dezw dezwVar2 = ((dezv) optional2.get()).c;
        if (!dezwVar.b() && dezwVar2.b()) {
            dhja.k("Endpoint needs to be notified because it has disconnected: %s", dezwVar2);
        }
        if (dezwVar.a() || !dezwVar2.a()) {
            return;
        }
        dhja.k("Endpoint needs to be notified because it has connected: %s", dezwVar2);
    }

    public final dezw a() {
        Optional optionalB = b();
        if (!optionalB.isEmpty()) {
            return ((dezv) optionalB.get()).c;
        }
        dhja.g("User contains no endpoints", new Object[0]);
        return dezw.DISCONNECTED;
    }

    public final Optional b() {
        Optional optionalEmpty = Optional.empty();
        for (dezv dezvVar : this.f) {
            if (dezvVar.b() && dezvVar.k != dfae.DELETED) {
                if (dezvVar.c.a()) {
                    return Optional.of(dezvVar);
                }
                optionalEmpty = Optional.of(dezvVar);
            }
        }
        return optionalEmpty;
    }

    final void c() {
        for (dezv dezvVar : this.f) {
            this.h = dfae.DELETED;
            dezvVar.c = dezw.DISCONNECTED;
            dezvVar.f = dezu.DEPARTED;
            dezvVar.k = dfae.FULL;
            dezvVar.a = null;
            dezvVar.b = Optional.empty();
            dezvVar.d = dezz.UNKNOWN;
            dezvVar.e = Optional.empty();
            dezvVar.i = Optional.empty();
            dezvVar.h.clear();
        }
    }

    final void d(dfaj dfajVar, crmx crmxVar) {
        Optional optionalEmpty;
        if (dfajVar.h()) {
            List list = this.f;
            ArrayList arrayList = new ArrayList(list);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                dezv dezvVar = (dezv) arrayList.get(i);
                if (!dezvVar.b() || dezvVar.k == dfae.DELETED) {
                    dhja.q("Clearing out invalid endpoint: %s", dezvVar);
                    list.remove(dezvVar);
                }
            }
            dfae dfaeVar = dfajVar.h;
            dfae dfaeVar2 = dfae.FULL;
            int iOrdinal = dfaeVar.ordinal();
            if (iOrdinal == 0) {
                dfah dfahVar = dfajVar.b;
                this.e = dfajVar.e;
                this.a = dfajVar.a;
                this.d = dfajVar.d;
                List<dezv> list2 = dfajVar.f;
                Optional optionalB = b();
                if (optionalB.isPresent()) {
                    optionalB = Optional.of(new dezv((dezv) optionalB.get()));
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    dezv dezvVar2 = (dezv) it.next();
                    Optional optionalI = i(list2, dezvVar2.j, crmxVar);
                    if (!optionalI.isPresent()) {
                        it.remove();
                    } else if (((dezv) optionalI.get()).b() && k((dezv) optionalI.get())) {
                        dhja.k("Skipping temporary disconnect endpoint during full update: %s", optionalI);
                    } else {
                        dezvVar2.a((dezv) optionalI.get());
                    }
                }
                for (dezv dezvVar3 : list2) {
                    if (!dezvVar3.b()) {
                        dhja.k("Skipping invalid endpoint during full update: %s", dezvVar3);
                    } else if (k(dezvVar3)) {
                        dhja.k("Skipping temporary disconnect endpoint during full update: %s", dezvVar3);
                    } else if (!i(list, dezvVar3.j, crmxVar).isPresent()) {
                        list.add(dezvVar3);
                    }
                }
                l(optionalB, b());
                e();
                this.c = dfajVar.c;
                return;
            }
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    return;
                }
                c();
                return;
            }
            dfajVar.b.isEmpty();
            String str = dfajVar.e;
            if (str != null) {
                this.e = str;
            }
            String str2 = dfajVar.a;
            if (str2 != null) {
                this.a = str2;
            }
            String str3 = dfajVar.d;
            if (str3 != null) {
                this.d = str3;
            }
            List<dezv> list3 = dfajVar.f;
            if (!list3.isEmpty()) {
                Optional optionalB2 = b();
                if (optionalB2.isPresent()) {
                    optionalB2 = Optional.of(new dezv((dezv) optionalB2.get()));
                }
                for (dezv dezvVar4 : list3) {
                    if (!dezvVar4.b()) {
                        dhja.k("Skipping invalid endpoint during partial update: %s", dezvVar4);
                    } else if (k(dezvVar4)) {
                        dhja.k("Skipping temporary disconnect endpoint during partial update: %s", dezvVar4);
                    } else {
                        String str4 = dezvVar4.j;
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                optionalEmpty = Optional.empty();
                                break;
                            }
                            dezv dezvVar5 = (dezv) it2.next();
                            if (dezvVar5.b()) {
                                String str5 = dezvVar5.j;
                                if (str5 == null) {
                                    throw new IllegalStateException("Local entity is null");
                                }
                                if (str5.equals(str4)) {
                                    optionalEmpty = Optional.of(dezvVar5);
                                    break;
                                }
                            } else {
                                dhja.g("User contains invalid endpoint!", new Object[0]);
                            }
                        }
                        if (optionalEmpty.isEmpty()) {
                            list.add(dezvVar4);
                        } else {
                            ((dezv) optionalEmpty.get()).a(dezvVar4);
                        }
                    }
                }
                l(optionalB2, b());
                e();
            }
            if (dfajVar.c.isEmpty()) {
                return;
            }
            this.c = dfajVar.c;
        }
    }

    public final void e() {
        this.j = a().a();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof dfaj)) {
            return false;
        }
        dfaj dfajVar = (dfaj) obj;
        return this.h == dfajVar.h && this.j == dfajVar.j && this.i == dfajVar.i && TextUtils.equals(this.g, dfajVar.g) && TextUtils.equals(this.a, dfajVar.a) && TextUtils.equals(this.d, dfajVar.d) && TextUtils.equals(this.e, dfajVar.e) && this.f.equals(dfajVar.f) && this.b.equals(dfajVar.b) && this.c.equals(dfajVar.c);
    }

    final void f() {
        dezw dezwVar;
        if (h()) {
            Optional optionalB = b();
            if (!optionalB.isPresent() || !((dezv) optionalB.get()).b() || (dezwVar = ((dezv) optionalB.get()).c) == dezw.PENDING || dezwVar == dezw.DIALING_IN || dezwVar == dezw.DIALING_OUT || dezwVar == dezw.ALERTING || dezwVar == dezw.DISCONNECTING || k((dezv) optionalB.get())) {
                return;
            }
            optionalB.get();
        }
    }

    public final boolean g() {
        Optional optionalB = b();
        return (optionalB.isEmpty() || j((dezv) optionalB.get())) ? false : true;
    }

    public final boolean h() {
        if (TextUtils.isEmpty(this.g)) {
            dhja.q("Invalid user. Entity is empty.", new Object[0]);
            return false;
        }
        if (this.h == dfae.NONE) {
            dhja.q("Invalid user. State is NONE.", new Object[0]);
            return false;
        }
        if (this.h != dfae.FULL || !this.f.isEmpty()) {
            return true;
        }
        dhja.q("Invalid user. Full state contains no endpoints.", new Object[0]);
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.h, Boolean.valueOf(this.j), Boolean.valueOf(this.i), this.g, this.a, this.d, this.e, this.f, this.b, this.c});
    }

    public final String toString() {
        dhiz dhizVar = dhiz.USER_ID;
        String strC = dhizVar.c(this.a);
        String strC2 = dhizVar.c(this.g);
        String strValueOf = String.valueOf(this.h);
        List list = this.f;
        return "User [mDisplaytext=" + strC + ", mEntity=" + strC2 + ", mState=" + strValueOf + ", mYourOwn=" + this.i + ", mHasJoined=" + this.j + ", mEndpoints=" + list.toString() + "]";
    }
}
