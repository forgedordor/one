package defpackage;

import j$.util.Objects;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nft implements nem {
    public mau a;
    public final nix b;
    private final mhk c;
    private final int d;
    private final nfs e;
    private final naa f;

    public nft(mhk mhkVar, nnw nnwVar) {
        nfs nfsVar = new nfs(nnwVar);
        naa naaVar = new naa();
        nix nixVar = new nix();
        this.c = mhkVar;
        this.e = nfsVar;
        this.f = naaVar;
        this.b = nixVar;
        this.d = 1048576;
    }

    @Override // defpackage.nem
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final nfu b(mbo mboVar) {
        nap napVar;
        mbl mblVar = mboVar.b;
        mee.f(mblVar);
        mee.f(mblVar);
        mbi mbiVar = mblVar.c;
        if (mbiVar == null) {
            napVar = nap.m;
        } else {
            naa naaVar = this.f;
            synchronized (naaVar.a) {
                if (!Objects.equals(mbiVar, naaVar.b)) {
                    naaVar.b = mbiVar;
                    mhx mhxVar = new mhx();
                    mhxVar.a = null;
                    naz nazVar = new naz(mhxVar);
                    ekqg ekqgVarListIterator = mbiVar.c.entrySet().listIterator();
                    while (ekqgVarListIterator.hasNext()) {
                        Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        mee.f(str);
                        mee.f(str2);
                        Map map = nazVar.b;
                        synchronized (map) {
                            map.put(str, str2);
                        }
                    }
                    HashMap map2 = new HashMap();
                    UUID uuid = maf.a;
                    UUID uuid2 = mbiVar.a;
                    int[] iArrJ = eonc.j(mbiVar.g);
                    for (int i : iArrJ) {
                        boolean z = true;
                        if (i != 2 && i != 1) {
                            z = false;
                        }
                        mee.a(z);
                    }
                    mzz mzzVar = new mzz(uuid2, nazVar, map2, (int[]) iArrJ.clone());
                    byte[] bArr = mbiVar.h;
                    byte[] bArrCopyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
                    mee.c(mzzVar.c.isEmpty());
                    mzzVar.k = bArrCopyOf;
                    naaVar.c = mzzVar;
                }
                napVar = naaVar.c;
                mee.f(napVar);
            }
        }
        return new nfu(mboVar, this.c, this.e, napVar, 1048576, this.a);
    }

    @Override // defpackage.nem
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.nem
    public final /* synthetic */ void c(boolean z) {
    }

    @Override // defpackage.nem
    public final /* synthetic */ void e(nvl nvlVar) {
    }
}
