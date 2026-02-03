package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajpj implements ajoz {
    public static final /* synthetic */ int g = 0;
    private static final eksp h = eksp.c("BugleContacts");
    public final eosc a;
    public final eosc b;
    public final eosc c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    private final Resources i;
    private final fcsu j;
    private final fcsu k;

    public ajpj(Context context, eosc eoscVar, eosc eoscVar2, eosc eoscVar3, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        this.i = context.getResources();
        this.a = eoscVar;
        this.b = eoscVar2;
        this.c = eoscVar3;
        this.j = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.k = fcsuVar4;
        this.f = fcsuVar5;
    }

    @Override // defpackage.ajoz
    public final eiju a(final String str) {
        if (((Boolean) cqjg.a.e()).booleanValue()) {
            final dzub dzubVarD = ((dzuc) this.f.b()).d();
            return eijx.h(new eooy() { // from class: ajpd
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    Cursor cursorA;
                    ekgb<cqjb> ekgbVar;
                    int i = ekgb.d;
                    ekfw ekfwVar = new ekfw();
                    final ajpj ajpjVar = this.a;
                    avcs avcsVar = (avcs) ajpjVar.d.b();
                    ejwl.l(!ecem.g());
                    if (((crma) avcsVar.b.b()).h() && (cursorA = new bacf(avcsVar.a, ContactsContract.Directory.ENTERPRISE_CONTENT_URI, cqjb.b, null, null, null).a()) != null) {
                        try {
                            ArrayList arrayList = new ArrayList(cursorA.getCount());
                            if (cursorA.moveToFirst()) {
                                do {
                                    arrayList.add(cqjb.c(cursorA));
                                } while (cursorA.moveToNext());
                            }
                            ekgb ekgbVarN = ekgb.n(arrayList);
                            cursorA.close();
                            ekgbVar = ekgbVarN;
                        } finally {
                        }
                    } else {
                        ekgbVar = ekoe.a;
                    }
                    for (cqjb cqjbVar : ekgbVar) {
                        if (!cqjb.e().contains(Long.valueOf(cqjbVar.a()))) {
                            ekfwVar.h(cqjbVar);
                        }
                    }
                    ekfw ekfwVar2 = new ekfw();
                    ekgb ekgbVarG = ekfwVar.g();
                    int i2 = ((ekoe) ekgbVarG).c;
                    for (int i3 = 0; i3 < i2; i3++) {
                        final String str2 = str;
                        final cqjb cqjbVar2 = (cqjb) ekgbVarG.get(i3);
                        ekfwVar2.h(eijs.d(new eopn() { // from class: ajpa
                            @Override // defpackage.eopn
                            public final Object a(eopt eoptVar) {
                                ajpj ajpjVar2 = ajpjVar;
                                cqjc cqjcVarB = ((avct) ajpjVar2.e.b()).b(str2, cqjbVar2);
                                eoptVar.a(cqjcVarB, ajpjVar2.a);
                                return cqjcVarB;
                            }
                        }, ajpjVar.c).f(new eopo() { // from class: ajpb
                            @Override // defpackage.eopo
                            public final Object a(eopt eoptVar, Object obj) {
                                return ajpjVar.d(((cqjc) obj).a());
                            }
                        }, ajpjVar.b).h());
                    }
                    final ekgb ekgbVarG2 = ekfwVar2.g();
                    return eijx.j(ekfwVar2.g()).a(new Callable() { // from class: ajpc
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            int i4;
                            int i5 = ajpj.g;
                            int i6 = ekgb.d;
                            ekfw ekfwVar3 = new ekfw();
                            HashSet hashSet = new HashSet();
                            int i7 = 0;
                            while (true) {
                                ekgb ekgbVar2 = ekgbVarG2;
                                if (i7 >= ((ekoe) ekgbVar2).c) {
                                    return ekfwVar3.g();
                                }
                                ekgb ekgbVar3 = (ekgb) eork.q((eiju) ekgbVar2.get(i7));
                                int size = ekgbVar3.size();
                                int i8 = 0;
                                while (true) {
                                    i4 = i7 + 1;
                                    if (i8 < size) {
                                        ajpq ajpqVar = (ajpq) ekgbVar3.get(i8);
                                        if (hashSet.add(ajpqVar.f())) {
                                            ekfwVar3.h(ajpqVar);
                                        }
                                        i8++;
                                    }
                                }
                                i7 = i4;
                            }
                        }
                    }, ajpjVar.a);
                }
            }, this.b).h(new ejvr() { // from class: ajpe
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    ekgb ekgbVar = (ekgb) obj;
                    ((dzuc) this.a.f.b()).f(dzubVarD, cqjd.c, null, dzua.SUCCESS);
                    return ekgbVar;
                }
            }, this.a);
        }
        int i = ekgb.d;
        return eijx.e(ekoe.a);
    }

    @Override // defpackage.ajoz
    public final eiju b(final String str) {
        if (!((Boolean) ctif.g.e()).booleanValue()) {
            final dzub dzubVarD = ((dzuc) this.f.b()).d();
            eopn eopnVar = new eopn() { // from class: ajpf
                @Override // defpackage.eopn
                public final Object a(eopt eoptVar) {
                    ajpj ajpjVar = this.a;
                    avct avctVar = (avct) ajpjVar.e.b();
                    String str2 = str;
                    cqjc cqjcVarC = avct.e(str2) ? avctVar.c(ContactsContract.CommonDataKinds.Email.CONTENT_FILTER_URI, str2, cqjb.a) : avctVar.d(ContactsContract.CommonDataKinds.Phone.CONTENT_FILTER_URI, str2, cqjb.a);
                    eoptVar.a(cqjcVarC, ajpjVar.a);
                    return cqjcVarC;
                }
            };
            eosc eoscVar = this.c;
            return eijs.d(eopnVar, eoscVar).f(new eopo() { // from class: ajpg
                @Override // defpackage.eopo
                public final Object a(eopt eoptVar, Object obj) throws Resources.NotFoundException {
                    ajpj ajpjVar = this.a;
                    fcsu fcsuVar = ajpjVar.f;
                    dzuc dzucVar = (dzuc) fcsuVar.b();
                    dzub dzubVar = dzubVarD;
                    dzfh dzfhVar = cqjd.a;
                    dzua dzuaVar = dzua.SUCCESS;
                    dzucVar.f(dzubVar, dzfhVar, null, dzuaVar);
                    ekgb ekgbVarD = ajpjVar.d(((cqjc) obj).a());
                    ((dzuc) fcsuVar.b()).f(dzubVar, cqjd.f, null, dzuaVar);
                    return ekgbVarD;
                }
            }, eoscVar).h();
        }
        ajps ajpsVar = (ajps) this.k.b();
        str.getClass();
        if (str.length() != 0) {
            dzub dzubVarD2 = ((dzuc) ajpsVar.d.b()).d();
            return auvw.c(ajpsVar.c, fcyi.a, fdjz.a, new ajpr(ajpsVar.f.a(str, "com.google.android.gms", new String[]{"internal.3p:Person"}, 0, 20, ajps.b), ajpsVar, dzubVarD2, null));
        }
        int i = ekgb.d;
        eiju eijuVarE = eijx.e(ekoe.a);
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.ajoz
    public final eiju c(final String str) {
        final dzub dzubVarD = ((dzuc) this.f.b()).d();
        return eijs.d(new eopn() { // from class: ajph
            @Override // defpackage.eopn
            public final Object a(eopt eoptVar) {
                ajpj ajpjVar = this.a;
                cqjc cqjcVarB = ((avct) ajpjVar.e.b()).b(str, cqjb.d());
                eoptVar.a(cqjcVarB, ajpjVar.a);
                return cqjcVarB;
            }
        }, this.c).f(new eopo() { // from class: ajpi
            @Override // defpackage.eopo
            public final Object a(eopt eoptVar, Object obj) {
                ajpj ajpjVar = this.a;
                ((dzuc) ajpjVar.f.b()).f(dzubVarD, cqjd.b, null, dzua.SUCCESS);
                return ajpjVar.d(((cqjc) obj).a());
            }
        }, this.a).h();
    }

    public final ekgb d(Cursor cursor) throws Resources.NotFoundException {
        fcsu fcsuVar;
        alqm alqmVarN;
        if (cursor == null) {
            int i = ekgb.d;
            return ekoe.a;
        }
        fcsu fcsuVar2 = this.f;
        dzub dzubVarD = ((dzuc) fcsuVar2.b()).d();
        int i2 = ekgb.d;
        ekfw ekfwVar = new ekfw();
        HashSet hashSet = new HashSet();
        int iIntValue = ((Integer) ctif.h.e()).intValue();
        boolean zBooleanValue = ((Boolean) ctif.i.e()).booleanValue();
        while (cursor.moveToNext() && (!zBooleanValue || cursor.getPosition() < iIntValue)) {
            String strB = ejwk.b(cursor.getString(1));
            String string = cursor.getString(2);
            String string2 = cursor.getString(6);
            if (string2 == null) {
                ((eksl) ((eksl) h.j()).h("com/google/android/apps/messaging/shared/api/messaging/contact/ContactSearchApiImpl", "cursorToSearchContactEntry", 190, "ContactSearchApiImpl.java")).q("Cp2 returns empty lookup key");
            } else {
                long j = cursor.getLong(7);
                if (hashSet.add(Long.valueOf(j))) {
                    String string3 = cursor.getString(3);
                    if (string3 == null || bbcf.c(string3)) {
                        fcsuVar = fcsuVar2;
                        alqmVarN = null;
                    } else {
                        fcsuVar = fcsuVar2;
                        alqmVarN = ((alrj) this.j.b()).n(string3);
                    }
                    if (alqmVarN == null) {
                        ((eksl) ((eksl) h.j()).h("com/google/android/apps/messaging/shared/api/messaging/contact/ContactSearchApiImpl", "cursorToSearchContactEntry", BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, "ContactSearchApiImpl.java")).q("Cp2 returns empty destination");
                    } else {
                        String string4 = Long.toString(j);
                        String string5 = cursor.getString(5);
                        if (string5 == null) {
                            string5 = this.i.getString(ContactsContract.CommonDataKinds.Phone.getTypeLabelResource(cursor.getInt(4)));
                        }
                        ekfwVar.h(new ajpn(string4, string2, strB, alqmVarN, string5, string == null ? null : Uri.parse(string)));
                    }
                    fcsuVar2 = fcsuVar;
                } else {
                    ((eksl) ((eksl) h.j()).h("com/google/android/apps/messaging/shared/api/messaging/contact/ContactSearchApiImpl", "cursorToSearchContactEntry", 198, "ContactSearchApiImpl.java")).q("Cp2 returns contact with duplicated id");
                }
            }
        }
        fcsu fcsuVar3 = fcsuVar2;
        if (dzubVarD != null) {
            ((dzuc) fcsuVar3.b()).f(dzubVarD, cqjd.e, null, dzua.SUCCESS);
        }
        return ekfwVar.g();
    }
}
