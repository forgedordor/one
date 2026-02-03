package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axw implements bdx {
    private final avp f;
    public int e = 0;
    public final Map b = new HashMap();
    public Set d = new HashSet();
    public final List a = new ArrayList();
    public List c = new ArrayList();

    public axw(avp avpVar) {
        this.f = avpVar;
        Set hashSet = new HashSet();
        try {
            hashSet = avpVar.a.b();
        } catch (aub unused) {
            bbs.c("Camera2CameraCoordinator", "Failed to get concurrent camera ids");
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ArrayList arrayList = new ArrayList((Set) it.next());
            if (arrayList.size() >= 2) {
                String str = (String) arrayList.get(0);
                String str2 = (String) arrayList.get(1);
                try {
                    if (apy.a(this.f, str) && apy.a(this.f, str2)) {
                        this.d.add(new HashSet(Arrays.asList(str, str2)));
                        if (!this.b.containsKey(str)) {
                            this.b.put(str, new ArrayList());
                        }
                        if (!this.b.containsKey(str2)) {
                            this.b.put(str2, new ArrayList());
                        }
                        ((List) this.b.get(str)).add((String) arrayList.get(1));
                        ((List) this.b.get(str2)).add((String) arrayList.get(0));
                    }
                } catch (bbq unused2) {
                    bbs.a("Camera2CameraCoordinator", a.d(str2, str, "Concurrent camera id pair: (", ", ", ") is not backward compatible"));
                }
            }
        }
    }

    @Override // defpackage.bdx
    public final void a(String str) {
        bmm bmmVar;
        Map map = this.b;
        if (map.containsKey(str)) {
            for (String str2 : (List) map.get(str)) {
                for (azd azdVar : this.c) {
                    if (azdVar instanceof apo) {
                        throw null;
                    }
                    bir birVarF = ((bir) azdVar).f();
                    lcg.b(birVarF instanceof ann, "CameraInfo doesn't contain Camera2 implementation.");
                    aye ayeVar = ((ann) birVarF).c;
                    if ((azdVar instanceof bgy) && (bmmVar = ((bgy) azdVar).a) != null) {
                        ann annVar = ayeVar.a;
                        bmmVar.n();
                        ayeVar = new aye(annVar);
                    }
                    if (str2.equals(ayeVar.a.a)) {
                        return;
                    }
                }
            }
        }
    }
}
