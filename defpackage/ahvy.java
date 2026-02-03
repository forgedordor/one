package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahvy extends fcyz implements fdat {
    final /* synthetic */ ahwd a;
    final /* synthetic */ UUID b;
    final /* synthetic */ int c;
    final /* synthetic */ String d = "metadata";
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahvy(fcxy fcxyVar, ahwd ahwdVar, UUID uuid, int i) {
        super(2, fcxyVar);
        this.a = ahwdVar;
        this.b = uuid;
        this.c = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahvy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        List listAo;
        Iterable iterableB;
        fctl.b(obj);
        ahwd ahwdVar = this.a;
        UUID uuid = this.b;
        File fileC = ahwdVar.c(uuid);
        String[] list = fileC.list(new ahvz());
        if (list != null) {
            int i = this.c;
            if (i < 0) {
                throw new IllegalArgumentException(a.e(i, "Requested element count ", " is less than zero."));
            }
            if (i == 0) {
                iterableB = fcvo.a;
            } else {
                if (i >= list.length) {
                    iterableB = fcur.M(list);
                } else {
                    if (i == 1) {
                        iterableB = fcva.b(list[0]);
                    } else {
                        ArrayList arrayList = new ArrayList(i);
                        int i2 = 0;
                        for (String str : list) {
                            arrayList.add(str);
                            i2++;
                            if (i2 == i) {
                                break;
                            }
                        }
                        iterableB = arrayList;
                    }
                }
            }
            listAo = fcva.ao(iterableB);
        } else {
            listAo = fcvo.a;
        }
        if (listAo.isEmpty()) {
            ahwdVar.j.i("Zero files with suffix [%s] found for session id [%s]", this.d, uuid);
            return ekfv.a(fcvo.a);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listAo.iterator();
        while (it.hasNext()) {
            File file = new File(fileC, (String) it.next());
            aiad aiadVar = null;
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    aiad aiadVar2 = (aiad) evsn.parseFrom(aiad.a, fczk.a(fileInputStream));
                    fczl.a(fileInputStream, null);
                    aiadVar = aiadVar2;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        fczl.a(fileInputStream, th);
                        throw th2;
                    }
                }
            } catch (FileNotFoundException unused) {
                this.a.j.l("Could not find metadata file [%s]", file.getAbsolutePath());
            } catch (IOException e) {
                this.a.j.o(e, "Error reading metadata file [%s]", file.getAbsolutePath());
            }
            if (aiadVar != null) {
                arrayList2.add(aiadVar);
            }
        }
        return ekfv.a(arrayList2);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ahvy ahvyVar = new ahvy(fcxyVar, this.a, this.b, this.c);
        ahvyVar.e = obj;
        return ahvyVar;
    }
}
