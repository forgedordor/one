package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.net.Uri;
import j$.time.Instant;
import java.security.KeyPair;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvtk implements dwxd {
    public final dvtm a;
    private final Context b;

    public dvtk(Context context, dvtm dvtmVar) {
        this.b = context;
        this.a = dvtmVar;
    }

    private final Cursor l(String[] strArr, String str, String[] strArr2) {
        return this.a.h(d("reachability INNER JOIN registration ON " + dvtr.b("reachability", "registration_id") + " = " + dvtr.b("registration", "registration_id")), strArr, str, strArr2, null, null);
    }

    private final void m(long j, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            dwpk dwpkVar = (dwpk) it.next();
            try {
                this.a.a(d("reachability"), "registration_id =? AND reachability_normalized_id =? ", new String[]{Long.toString(j), dwpkVar.b() == dwpj.EMAIL ? dvhq.a(dwpkVar.d()) : dwpkVar.d()});
            } catch (SQLException e) {
                dvhv.d("SQLiteRegStore", "Failed to delete Registration.", e);
            }
        }
    }

    public final Cursor a() {
        return this.a.h(d("registration"), new String[]{"registration_id"}, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Cursor b(dwjh dwjhVar) {
        Cursor cursorC = c(dwjhVar.f());
        ekgb ekgbVarG = dwjhVar.g();
        int i = ((ekoe) ekgbVarG).c;
        for (int i2 = 0; i2 < i; i2++) {
            dwpk dwpkVar = (dwpk) ekgbVarG.get(i2);
            if (cursorC.moveToFirst()) {
                break;
            }
            cursorC.close();
            cursorC = c(dwpkVar);
        }
        return cursorC;
    }

    public final Cursor c(dwpk dwpkVar) {
        return l(dvtr.i("registration", dvwz.a), "reachability_normalized_id =? AND reachability_type =? AND tachyon_app_name =?", new String[]{dwpkVar.b() == dwpj.EMAIL ? dvhq.a(dwpkVar.d()) : dwpkVar.d(), String.valueOf(dwpkVar.b().f), dwpkVar.e()});
    }

    public final Uri d(String str) {
        return dvtr.a(String.valueOf(this.b.getPackageName()).concat(".lighter.data"), "REGISTRATION", str, new String[0]);
    }

    @Override // defpackage.dwxd
    public final ejwi e(final dwpk dwpkVar) {
        try {
            if (fbeo.c()) {
                return (ejwi) dvtq.a(this.a, new Callable() { // from class: dvtf
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        dvtk dvtkVar = this.a;
                        dwpk dwpkVar2 = dwpkVar;
                        ejwi ejwiVarF = ejud.a;
                        Cursor cursorC = dvtkVar.c(dwpkVar2);
                        try {
                            if (cursorC.moveToFirst()) {
                                ejwiVarF = dvtkVar.f(cursorC.getInt(dvwy.a(1)));
                            }
                            if (cursorC != null) {
                                cursorC.close();
                            }
                            return ejwiVarF;
                        } catch (Throwable th) {
                            if (cursorC != null) {
                                try {
                                    cursorC.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    }
                });
            }
            try {
                this.a.d();
                ejwi ejwiVarF = ejud.a;
                Cursor cursorC = c(dwpkVar);
                try {
                    if (cursorC.moveToFirst()) {
                        ejwiVarF = f(cursorC.getInt(dvwy.a(1)));
                    }
                    if (cursorC != null) {
                        cursorC.close();
                    }
                    this.a.f();
                    return ejwiVarF;
                } catch (Throwable th) {
                    if (cursorC != null) {
                        try {
                            cursorC.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Exception e) {
                throw new SQLException("Error when executing transaction!!", e);
            }
        } finally {
            this.a.e();
        }
    }

    public final ejwi f(long j) {
        ejwl.l(this.a.g());
        Cursor cursorL = l(dvtr.h(dvtr.i("registration", dvwz.a), dvtr.i("reachability", dvwx.a)), "registration.registration_id =? ", new String[]{Long.toString(j)});
        try {
            if (!cursorL.moveToFirst()) {
                if (cursorL != null) {
                    cursorL.close();
                }
                return ejud.a;
            }
            String string = cursorL.getString(cursorL.getColumnIndex("tachyon_app_name"));
            long j2 = cursorL.getLong(cursorL.getColumnIndex("registration_id"));
            byte[] blob = cursorL.getBlob(cursorL.getColumnIndex("server_registration_id"));
            final int i = cursorL.getInt(cursorL.getColumnIndex("server_registration_status"));
            dwin dwinVar = new dwin();
            dwinVar.d(string);
            HashSet hashSet = new HashSet();
            do {
                String string2 = cursorL.getString(cursorL.getColumnIndex("reachability_id"));
                int iOrdinal = dwpj.a(cursorL.getInt(cursorL.getColumnIndex("reachability_type"))).ordinal();
                if (iOrdinal == 1) {
                    hashSet.add(string2);
                } else if (iOrdinal == 2) {
                    dwinVar.b(string2);
                } else if (iOrdinal == 4) {
                    dwinVar.a(string2);
                }
            } while (cursorL.moveToNext());
            dwinVar.c(hashSet);
            dwjb dwjbVarE = dwje.e();
            dwjbVarE.c(j2);
            dwjbVarE.d(evqs.x(blob));
            dwjbVarE.f(dwinVar);
            dwjbVarE.e((dwjd) ekeh.e(dwjd.values()).a(new ejwm() { // from class: dwjc
                @Override // defpackage.ejwm
                public final boolean a(Object obj) {
                    return ((dwjd) obj).c == i;
                }
            }).e(dwjd.VALID));
            ejwi ejwiVarJ = ejwi.j(dwjbVarE.a());
            if (cursorL != null) {
                cursorL.close();
            }
            return ejwiVarJ;
        } catch (Throwable th) {
            if (cursorL != null) {
                try {
                    cursorL.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // defpackage.dwxd
    public final ejwi g(dwje dwjeVar) {
        Cursor cursorB = b(dwjeVar.c());
        try {
            if (!cursorB.moveToFirst()) {
                ejud ejudVar = ejud.a;
                if (cursorB != null) {
                    cursorB.close();
                }
                return ejudVar;
            }
            dwjs dwjsVarA = dwju.a();
            dwjsVarA.b(eonw.b(cursorB.getLong(dvwy.a(4))));
            dwjsVarA.d(Instant.ofEpochMilli(cursorB.getLong(dvwy.a(10))));
            dwjsVarA.e(dvhz.a(cursorB.getBlob(dvwy.a(3))));
            ejwi ejwiVarB = dvux.b(cursorB.getBlob(dvwy.a(6)), cursorB.getBlob(dvwy.a(7)));
            if (ejwiVarB.g()) {
                dwjsVarA.f((KeyPair) ejwiVarB.c());
            }
            ejwi ejwiVarJ = ejwi.j(dwjsVarA.a());
            if (cursorB != null) {
                cursorB.close();
            }
            return ejwiVarJ;
        } catch (Throwable th) {
            if (cursorB != null) {
                try {
                    cursorB.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // defpackage.dwxd
    public final ekgb h() {
        if (fbeo.c()) {
            return (ekgb) dvtq.a(this.a, new Callable() { // from class: dvth
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    dvtk dvtkVar = this.a;
                    Cursor cursorA = dvtkVar.a();
                    try {
                        ekfw ekfwVar = new ekfw();
                        while (cursorA != null && cursorA.moveToNext()) {
                            ejwi ejwiVarF = dvtkVar.f(cursorA.getLong(0));
                            if (ejwiVarF.g()) {
                                ekfwVar.h(ejwiVarF.c());
                            }
                        }
                        ekgb ekgbVarG = ekfwVar.g();
                        if (cursorA != null) {
                            cursorA.close();
                        }
                        return ekgbVarG;
                    } catch (Throwable th) {
                        if (cursorA != null) {
                            try {
                                cursorA.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
            });
        }
        ekfw ekfwVar = new ekfw();
        try {
            try {
                dvtm dvtmVar = this.a;
                dvtmVar.d();
                Cursor cursorA = a();
                while (cursorA != null) {
                    try {
                        if (!cursorA.moveToNext()) {
                            break;
                        }
                        ejwi ejwiVarF = f(cursorA.getLong(0));
                        if (ejwiVarF.g()) {
                            ekfwVar.h(ejwiVarF.c());
                        }
                    } catch (Throwable th) {
                        try {
                            cursorA.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (cursorA != null) {
                    cursorA.close();
                }
                dvtmVar.f();
                dvtmVar.e();
                return ekfwVar.g();
            } catch (Exception e) {
                throw new SQLException("Error when executing transaction!!", e);
            }
        } catch (Throwable th3) {
            this.a.e();
            throw th3;
        }
    }

    public final void i(long j, dwjh dwjhVar) {
        ejwi ejwiVarF = f(j);
        HashSet<dwpk> hashSetE = ekpg.e(dwjhVar.g());
        if (ejwiVarF.g()) {
            Set setE = ekpg.e(((dwim) ejwiVarF.c()).b.g());
            setE.removeAll(hashSetE);
            m(j, setE);
        }
        for (dwpk dwpkVar : hashSetE) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("reachability_id", dwpkVar.d());
            contentValues.put("reachability_normalized_id", dwpkVar.b() == dwpj.EMAIL ? dvhq.a(dwpkVar.d()) : dwpkVar.d());
            contentValues.put("reachability_type", Integer.valueOf(dwpkVar.b().f));
            contentValues.put("registration_id", Long.valueOf(j));
            this.a.c(d("reachability"), contentValues, 5);
        }
    }

    @Override // defpackage.dwxd
    public final boolean j(dwje dwjeVar) {
        dwpk dwpkVarF = dwjeVar.c().f();
        try {
            dvtm dvtmVar = this.a;
            Uri uriD = d("registration");
            String str = "registration.registration_id IN (SELECT registration.registration_id FROM reachability INNER JOIN registration ON " + dvtr.b("reachability", "registration_id") + " = " + dvtr.b("registration", "registration_id") + " WHERE reachability_normalized_id =? AND reachability_type =? AND tachyon_app_name =?)";
            dwpj dwpjVar = ((dwiq) dwpkVarF).c;
            dvtmVar.a(uriD, str, new String[]{dwpjVar == dwpj.EMAIL ? dvhq.a(((dwiq) dwpkVarF).a) : ((dwiq) dwpkVarF).a, String.valueOf(dwpjVar.f), ((dwiq) dwpkVarF).b});
            return true;
        } catch (SQLException e) {
            dvhv.d("SQLiteRegStore", "Failed to delete Registration.", e);
            return false;
        }
    }

    public final boolean k(final dwpk dwpkVar, final ContentValues contentValues) {
        return ((Boolean) dvtq.a(this.a, new Callable() { // from class: dvtg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                long j;
                dvtk dvtkVar = this.a;
                ContentValues contentValues2 = contentValues;
                dwpk dwpkVar2 = dwpkVar;
                Cursor cursorC = dvtkVar.c(dwpkVar2);
                try {
                    if (cursorC.moveToFirst()) {
                        j = cursorC.getInt(dvwy.a(1));
                        dvtkVar.a.b(dvtkVar.d("registration"), contentValues2, "registration_id =? AND tachyon_app_name =?", new String[]{Long.toString(j), dwpkVar2.e()});
                    } else {
                        j = -1;
                    }
                    if (cursorC != null) {
                        cursorC.close();
                    }
                    return Boolean.valueOf(j != -1);
                } catch (Throwable th) {
                    if (cursorC != null) {
                        try {
                            cursorC.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        })).booleanValue();
    }
}
