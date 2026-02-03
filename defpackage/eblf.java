package defpackage;

import j$.util.Optional;
import java.util.ArrayList;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eblf {
    public volatile ebkw b;
    public String c;
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    private final ArrayList f = new ArrayList();
    public final ArrayList d = new ArrayList();
    public Optional e = Optional.empty();
    private final ebld g = new ebld(this);

    protected eblf() {
    }

    public static final String w() {
        return String.format(Locale.US, "%s", UUID.randomUUID());
    }

    private final void x(ebqq ebqqVar) throws eblb {
        if (ebqqVar.x()) {
            return;
        }
        ebqr ebqrVar = (ebqr) ebqqVar;
        if (ebqrVar.z().equals("SUBSCRIBE") || ebqrVar.z().equals("PUBLISH")) {
            return;
        }
        ebma ebmaVarW = ((ebpd) ebqqVar.a).w();
        String strD = ebmaVarW.d();
        if ("sip".equals(strD) || "sips".equals(strD)) {
            eblx eblxVar = (eblx) ebmaVarW;
            String strE = eblxVar.e();
            String strB = eblxVar.b();
            if (strE == null || strB == null) {
                return;
            }
            if (dhim.a(h(), strE) && dhim.a(f(), strB)) {
                throw new eblb();
            }
        }
        if ("tel".equals(strD)) {
            ebly eblyVar = (ebly) ebmaVarW;
            if (h().equals(eblyVar.e() ? "+".concat(String.valueOf(eblyVar.a())) : eblyVar.a())) {
                throw new eblb();
            }
        }
    }

    public abstract dhip a();

    public abstract ebkr b();

    public abstract ebln c();

    public abstract ebmr d();

    public abstract ekgb e();

    public abstract String f();

    public abstract String g();

    public abstract String h();

    public int i() {
        return m().a();
    }

    public int j() {
        return m().b();
    }

    public eblm k(ebqq ebqqVar, eblu ebluVar) throws ebmn {
        x(ebqqVar);
        eblm eblmVarA = c().a(ebqqVar, ebluVar);
        if (eblmVarA == null) {
            throw new ebmn("SipTransactionContext is null");
        }
        s(ebqqVar);
        return eblmVarA;
    }

    public eblm l(ebqq ebqqVar) {
        return k(ebqqVar, null);
    }

    public final ebqv m() {
        return c().b();
    }

    public String n() {
        return m().e();
    }

    public String o() {
        return m().f();
    }

    public String p() {
        return d().d;
    }

    public final ArrayList q() {
        return new ArrayList(this.f);
    }

    public final void r(ebkz ebkzVar) {
        dhja.d(a(), "Add a SIP listener", new Object[0]);
        this.a.add(ebkzVar);
    }

    public void s(ebqq ebqqVar) throws ebmn {
        String str;
        x(ebqqVar);
        try {
            ekgb ekgbVarE = e();
            int size = ekgbVarE.size();
            for (int i = 0; i < size; i++) {
                ((ebla) ekgbVarE.get(i)).a(ebqqVar);
            }
            c().d(ebqqVar.a);
            if (ebqqVar.x()) {
                ebqs ebqsVar = (ebqs) ebqqVar;
                str = "Sent SIP response with code: " + ebqsVar.y() + " and callid: " + ebqsVar.d();
            } else {
                ebqr ebqrVar = (ebqr) ebqqVar;
                str = "Sent SIP request with method: " + ebqrVar.z() + " and callid: " + ebqrVar.d();
            }
            dhja.w(26, 3, "%s", str);
            if (((Boolean) dfbu.h.a()).booleanValue()) {
                dhja.c("\n%s", ebqqVar.n());
            }
        } catch (ebmn e) {
            dhja.j(e, a(), "Can't send SIP message", new Object[0]);
            throw e;
        } catch (Exception e2) {
            dhja.j(e2, a(), "Can't send SIP message", new Object[0]);
            throw new ebmn(e2.getMessage(), e2);
        }
    }

    public final void t(ArrayList arrayList) {
        ArrayList arrayList2 = this.f;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }

    public final void u() {
        c().e(this.g);
    }

    public boolean v() {
        return false;
    }
}
