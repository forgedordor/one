package com.google.android.libraries.onegoogle.owners.mdi;

import android.accounts.Account;
import android.content.Context;
import com.google.android.libraries.onegoogle.owners.mdi.MdiOwnersLoader;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.dvdg;
import defpackage.dyyl;
import defpackage.eika;
import defpackage.ejvr;
import defpackage.ejwi;
import defpackage.eooz;
import defpackage.eoqg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class MdiOwnersLoader {
    public final dvdg a;
    public final dyyl b;
    private final ejwi c;
    private final String d;

    /* compiled from: PG */
    public static class MdiException extends Exception {
        public MdiException(String str) {
            super(str);
        }
    }

    public MdiOwnersLoader(Context context, dvdg dvdgVar, dyyl dyylVar, ejwi ejwiVar) {
        this.a = dvdgVar;
        this.b = dyylVar;
        this.c = ejwiVar;
        this.d = context.getPackageName();
    }

    public final ListenableFuture a(final ejvr ejvrVar) {
        return eika.k(this.b.a(), new eooz() { // from class: dzai
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final List list = (List) obj;
                final ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    final MdiOwnersLoader mdiOwnersLoader = this.a;
                    if (!it.hasNext()) {
                        return eika.a(arrayList).a(new Callable() { // from class: dzah
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                List list2 = list;
                                int size = list2.size();
                                ekfw ekfwVarD = ekgb.d(size);
                                for (int i = 0; i < size; i++) {
                                    List list3 = arrayList;
                                    MdiOwnersLoader mdiOwnersLoader2 = mdiOwnersLoader;
                                    dyyq dyyqVarM = dyys.m();
                                    dyyqVarM.b(((Account) list2.get(i)).name);
                                    mdiOwnersLoader2.b(dyyqVarM, (ListenableFuture) list3.get(i));
                                    ekfwVarD.h(dyyqVarM.a());
                                }
                                return ekfwVarD.g();
                            }
                        }, eoqg.a);
                    }
                    arrayList.add((ListenableFuture) ejvrVar.apply(mdiOwnersLoader.a.a((Account) it.next())));
                }
            }
        }, eoqg.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b8 A[Catch: all -> 0x0070, TryCatch #0 {all -> 0x0070, blocks: (B:3:0x000d, B:4:0x0019, B:6:0x001f, B:17:0x0061, B:18:0x0065, B:20:0x0069, B:27:0x0079, B:29:0x0081, B:30:0x008a, B:32:0x0096, B:33:0x0098, B:35:0x00a2, B:39:0x00d5, B:43:0x00ec, B:44:0x00f1, B:46:0x00f9, B:48:0x0108, B:50:0x010c, B:52:0x0115, B:54:0x0119, B:56:0x0122, B:57:0x0124, B:58:0x0129, B:60:0x012f, B:62:0x0133, B:63:0x013b, B:64:0x0142, B:66:0x014a, B:76:0x0174, B:73:0x0162, B:74:0x0168, B:75:0x016e, B:78:0x017a, B:80:0x0182, B:82:0x0186, B:83:0x018b, B:84:0x018c, B:85:0x0190, B:86:0x0191, B:87:0x0198, B:89:0x019a, B:90:0x01a5, B:9:0x0030, B:13:0x0047, B:15:0x0056, B:16:0x0059, B:91:0x01a6, B:93:0x01b8, B:98:0x01cb, B:99:0x01d5, B:100:0x01d6, B:101:0x01e0, B:102:0x01e1), top: B:107:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.dyyq r13, com.google.common.util.concurrent.ListenableFuture r14) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.onegoogle.owners.mdi.MdiOwnersLoader.b(dyyq, com.google.common.util.concurrent.ListenableFuture):void");
    }
}
