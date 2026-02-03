package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.HashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajot {
    public static final cqce a = cqce.g("BugleContacts", "BugleFavoriteContactProvider");
    public final fcsu b;
    final AtomicReference c = new AtomicReference(Optional.empty());
    private final ajpl d;
    private final ajok e;
    private final eosc f;

    public ajot(ajpl ajplVar, ajok ajokVar, eosc eoscVar, fcsu fcsuVar) {
        this.d = ajplVar;
        this.e = ajokVar;
        this.f = eoscVar;
        this.b = fcsuVar;
    }

    public static boolean d(Cursor cursor) {
        return cursor.getString(4) == null;
    }

    public final ajpk a(Cursor cursor) {
        int i = cursor.getInt(5);
        String string = cursor.getString(4);
        string.getClass();
        ajpl ajplVar = this.d;
        Context context = (Context) ajplVar.a.b();
        context.getClass();
        alrj alrjVar = (alrj) ajplVar.b.b();
        alrjVar.getClass();
        return new ajpk(context, alrjVar, i, string);
    }

    public final eiju b() {
        return eijx.g(new Callable() { // from class: ajor
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i;
                String strSubstring;
                ajot ajotVar = this.a;
                avcs avcsVar = (avcs) ajotVar.b.b();
                int i2 = 1;
                cqjf cqjfVar = !((crma) avcsVar.b.b()).h() ? null : new cqjf(avcsVar.a, avcr.b, "account_type NOT IN (\"com.whatsapp\", \"com.google.android.apps.tachyon\") ", true);
                if (cqjfVar == null) {
                    int i3 = ekgb.d;
                    return ekoe.a;
                }
                int i4 = ekgb.d;
                ekfw ekfwVar = new ekfw();
                Cursor cursorA = cqjfVar.a();
                if (cursorA != null) {
                    try {
                        if (cursorA.moveToNext()) {
                            HashSet hashSet = new HashSet();
                            while (!cursorA.isAfterLast()) {
                                String string = cursorA.getString(3);
                                string.getClass();
                                while (hashSet.contains(string) && cursorA.moveToNext()) {
                                    string = cursorA.getString(3);
                                    string.getClass();
                                }
                                if (cursorA.isAfterLast()) {
                                    break;
                                }
                                long j = cursorA.getLong(0);
                                String string2 = cursorA.getString(3);
                                string2.getClass();
                                hashSet.add(string2);
                                if (ajot.d(cursorA)) {
                                    ekgb ekgbVarC = ajotVar.c(cursorA);
                                    cursorA.close();
                                    return ekgbVarC;
                                }
                                String strB = ejwk.b(cursorA.getString(i2));
                                String string3 = cursorA.getString(2);
                                ekfw ekfwVar2 = new ekfw();
                                ekfwVar2.h(ajotVar.a(cursorA));
                                int position = -1;
                                while (cursorA.moveToNext()) {
                                    String string4 = cursorA.getString(3);
                                    string4.getClass();
                                    if (string2.equals(string4)) {
                                        if (ajot.d(cursorA)) {
                                            ekgb ekgbVarC2 = ajotVar.c(cursorA);
                                            cursorA.close();
                                            return ekgbVarC2;
                                        }
                                        ekfwVar2.h(ajotVar.a(cursorA));
                                    } else if (position == -1) {
                                        position = cursorA.getPosition();
                                    }
                                }
                                if (position >= 0) {
                                    cursorA.moveToPosition(position);
                                }
                                if (strB.length() > 0) {
                                    i = 1;
                                    strSubstring = strB.substring(0, 1);
                                } else {
                                    i = 1;
                                    strSubstring = strB;
                                }
                                ekfwVar.h(ajpm.g(j, string2, strSubstring, strB, ekfwVar2.g(), string3 == null ? null : Uri.parse(string3)));
                                i2 = i;
                            }
                            ekgb ekgbVarG = ekfwVar.g();
                            cursorA.close();
                            return ekgbVarG;
                        }
                    } finally {
                    }
                }
                ekgb ekgbVar = ekoe.a;
                if (cursorA != null) {
                    cursorA.close();
                }
                return ekgbVar;
            }
        }, this.f);
    }

    public final ekgb c(Cursor cursor) {
        cursor.moveToPosition(-1);
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        while (cursor.moveToNext()) {
            String string = cursor.getString(3);
            string.getClass();
            ekfwVar.h(string);
        }
        ajok ajokVar = this.e;
        final ekgb ekgbVarG = ekfwVar.g();
        return ekgbVarG.isEmpty() ? ekoe.a : ajokVar.a("getContactsByLookupKeys", new Function() { // from class: ajoj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bnfd bnfdVar = (bnfd) obj;
                bnfdVar.ap(new dqpm("contacts.lookup_key", 3, bnfd.as(ekgbVarG), false));
                return bnfdVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }
}
