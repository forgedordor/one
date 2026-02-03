package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Map;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbay {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueDebugger");
    public final Context b;
    public final eosc c;
    public final cbbj d;
    public final eigp e;
    public final fcsu f;
    public final eygg g;

    public cbay(Context context, eosc eoscVar, cbbj cbbjVar, eigp eigpVar, fcsu fcsuVar, eygg eyggVar) {
        this.b = context;
        this.c = eoscVar;
        this.d = cbbjVar;
        this.e = eigpVar;
        this.f = fcsuVar;
        this.g = eyggVar;
    }

    public final eiju a(final caxw caxwVar, final EnumSet enumSet, final boolean z, final Pattern pattern, final Pattern pattern2) {
        Callable callable = new Callable() { // from class: cbao
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() throws Throwable {
                int i;
                int i2;
                long j;
                Object obj;
                Object obj2;
                Object obj3;
                caxv caxvVarA;
                boolean z2;
                ekfd ekfdVar;
                Throwable th;
                Pattern pattern3;
                Object obj4;
                char c;
                char c2;
                int i3;
                String string;
                EnumSet enumSet2 = enumSet;
                cazh cazhVar = cazh.DUMP_DB;
                boolean zContains = enumSet2.contains(cazhVar);
                caxw caxwVar2 = caxwVar;
                Pattern pattern4 = pattern;
                int i4 = 0;
                int i5 = 1;
                if (zContains) {
                    caxwVar2.d(cazhVar.toString());
                    caxwVar2.b("PWQ database dump:");
                    cbfd cbfdVarA = cbfi.a();
                    cbfdVarA.A("WorkQueueDebugger#dumpDatabase1");
                    cbfdVarA.n(new dqxm("COUNT(*)"), "count");
                    Function function = new Function() { // from class: cbas
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function2) {
                            return Function$CC.$default$andThen(this, function2);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj5) {
                            cbeg cbegVar = (cbeg) obj5;
                            return new cbeh[]{cbegVar.f, cbegVar.b};
                        }

                        public final /* synthetic */ Function compose(Function function2) {
                            return Function$CC.$default$compose(this, function2);
                        }
                    };
                    cbeg cbegVar = cbfi.c;
                    cbfdVarA.c((cbeh[]) function.apply(cbegVar));
                    cbfdVarA.w(cbegVar.f);
                    final cbei cbeiVar = (cbei) cbfdVarA.b().p();
                    try {
                        caxv caxvVarA2 = caxwVar2.a();
                        while (cbeiVar.moveToNext()) {
                            try {
                                if (pattern4 == null || pattern4.matcher(cbeiVar.f()).matches()) {
                                    caxwVar2.b(cbeiVar.e() + " ==> " + cbeiVar.de("count"));
                                    caxv caxvVarA3 = caxwVar2.a();
                                    try {
                                        HashSet hashSet = new HashSet();
                                        HashSet hashSet2 = new HashSet();
                                        cbfd cbfdVarA2 = cbfi.a();
                                        cbfdVarA2.A("WorkQueueDebugger#dumpDatabase2");
                                        cbfdVarA2.e(new Function() { // from class: cbat
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo536andThen(Function function2) {
                                                return Function$CC.$default$andThen(this, function2);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj5) {
                                                cbfh cbfhVar = (cbfh) obj5;
                                                cbfhVar.i(cbeiVar.f());
                                                return cbfhVar;
                                            }

                                            public final /* synthetic */ Function compose(Function function2) {
                                                return Function$CC.$default$compose(this, function2);
                                            }
                                        });
                                        cbei cbeiVar2 = (cbei) cbfdVarA2.b().p();
                                        obj2 = obj2;
                                        while (true) {
                                            try {
                                                cbdg cbdgVar = (cbdg) cbeiVar2.cS();
                                                if (cbdgVar == null) {
                                                    break;
                                                }
                                                int i6 = i4;
                                                int i7 = i5;
                                                String strConcat = cbdgVar.m() + "; " + cbdgVar.r() + "; " + cbdgVar.q();
                                                String strP = cbdgVar.p();
                                                if (strP != null) {
                                                    strConcat = a.q(strP, strConcat, "; ");
                                                }
                                                Date dateS = cbdgVar.s();
                                                long time = dateS.getTime();
                                                if (time != 0) {
                                                    strConcat = strConcat + "; " + String.valueOf(dateS);
                                                }
                                                if (hashSet.contains(strP)) {
                                                    strConcat = strConcat.concat(" DEDUPE ERROR");
                                                }
                                                if (hashSet2.contains(Integer.valueOf(Arrays.hashCode(cbdgVar.t())))) {
                                                    strConcat = strConcat.concat(" PROTO DUPE");
                                                }
                                                caxwVar2.b(strConcat);
                                                String strP2 = cbdgVar.p();
                                                if (strP2 != null) {
                                                    hashSet.add(strP2);
                                                }
                                                hashSet2.add(Integer.valueOf(Arrays.hashCode(cbdgVar.t())));
                                                i5 = i7;
                                                i4 = i6;
                                                obj2 = time;
                                            } catch (Throwable th2) {
                                                try {
                                                    cbeiVar2.close();
                                                    throw th2;
                                                } catch (Throwable th3) {
                                                    th2.addSuppressed(th3);
                                                    throw th2;
                                                }
                                            }
                                        }
                                        int i8 = i4;
                                        int i9 = i5;
                                        cbeiVar2.close();
                                        caxvVarA3.close();
                                        i5 = i9;
                                        i4 = i8;
                                    } catch (Throwable th4) {
                                        try {
                                            caxvVarA3.close();
                                            throw th4;
                                        } catch (Throwable th5) {
                                            th4.addSuppressed(th5);
                                            throw th4;
                                        }
                                    }
                                }
                            } finally {
                                try {
                                    caxvVarA2.close();
                                    throw th;
                                } catch (Throwable th6) {
                                    th.addSuppressed(th6);
                                }
                            }
                        }
                        i = i4;
                        i2 = i5;
                        j = 0;
                        caxvVarA2.close();
                        cbeiVar.close();
                    } finally {
                    }
                } else {
                    i = 0;
                    i2 = 1;
                    j = 0;
                }
                cbay cbayVar = this.a;
                cazh cazhVar2 = cazh.DUMP_EXECUTION;
                if (enumSet2.contains(cazhVar2)) {
                    caxwVar2.d(cazhVar2.toString());
                    ((cbkt) cbayVar.g.b()).c(caxwVar2, pattern4);
                }
                cazh cazhVar3 = cazh.DUMP_HISTORY;
                if (!enumSet2.contains(cazhVar3)) {
                    return null;
                }
                caxwVar2.d(cazhVar3.toString());
                cbbj cbbjVar = cbayVar.d;
                Object obj5 = cbbjVar.d;
                synchronized (obj5) {
                    try {
                        try {
                            caxwVar2.b("PWQ Recent History: (raw number " + cbbjVar.e.size() + ")");
                            try {
                                caxvVarA = caxwVar2.a();
                                z2 = z;
                                try {
                                    if (z2) {
                                        try {
                                            ekfdVar = new ekfd();
                                        } catch (Throwable th7) {
                                            th = th7;
                                            obj = obj5;
                                            obj2 = null;
                                            try {
                                                caxvVarA.close();
                                                throw th;
                                            } catch (Throwable th8) {
                                                th.addSuppressed(th8);
                                                throw th;
                                            }
                                        }
                                    } else {
                                        ekfdVar = null;
                                    }
                                    pattern3 = pattern2;
                                    if (z2) {
                                        Iterator<E> it = cbbjVar.e.iterator();
                                        int i10 = -1;
                                        while (it.hasNext()) {
                                            cbbi cbbiVar = (cbbi) it.next();
                                            i10++;
                                            if (cbbiVar.a(pattern4, pattern3)) {
                                                Map.EL.putIfAbsent(ekfdVar, Long.valueOf(cbbj.a(cbbiVar.c)), Integer.valueOf(i10));
                                            }
                                        }
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    caxwVar2.b(a.J(th, "caught exception in dumpStateForDebugging "));
                                    obj3 = obj2;
                                    return obj3;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                obj = obj5;
                                obj2 = null;
                            }
                            try {
                                Iterator<E> it2 = cbbjVar.e.iterator();
                                while (it2.hasNext()) {
                                    cbbi cbbiVar2 = (cbbi) it2.next();
                                    if (cbbiVar2.a(pattern4, pattern3)) {
                                        Object obj6 = cbbiVar2.b;
                                        obj4 = null;
                                        obj4 = null;
                                        if (obj6 instanceof cbdg) {
                                            try {
                                                cbdg cbdgVar2 = (cbdg) obj6;
                                                Locale locale = Locale.US;
                                                c = 3;
                                                c2 = 2;
                                                Locale locale2 = Locale.US;
                                                i3 = 4;
                                                obj = obj5;
                                                try {
                                                    String strValueOf = String.valueOf(cbdgVar2.a);
                                                    String strValueOf2 = String.valueOf(cbdgVar2.b);
                                                    byte[] bArr = cbdgVar2.c;
                                                    String strConcat2 = "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL"));
                                                    String strValueOf3 = String.valueOf(cbdgVar2.d);
                                                    String strValueOf4 = String.valueOf(cbdgVar2.e);
                                                    String strValueOf5 = String.valueOf(cbdgVar2.f);
                                                    String strValueOf6 = String.valueOf(cbdgVar2.g);
                                                    String strValueOf7 = String.valueOf(cbdgVar2.h);
                                                    String strValueOf8 = String.valueOf(cbdgVar2.i);
                                                    String strValueOf9 = String.valueOf(cbdgVar2.j);
                                                    String strValueOf10 = String.valueOf(cbdgVar2.k);
                                                    Object[] objArr = new Object[11];
                                                    objArr[i] = strValueOf;
                                                    objArr[i2] = strValueOf2;
                                                    objArr[2] = strConcat2;
                                                    objArr[3] = strValueOf3;
                                                    objArr[4] = strValueOf4;
                                                    objArr[5] = strValueOf5;
                                                    objArr[6] = strValueOf6;
                                                    objArr[7] = strValueOf7;
                                                    objArr[8] = strValueOf8;
                                                    objArr[9] = strValueOf9;
                                                    objArr[10] = strValueOf10;
                                                    Object[] objArr2 = new Object[i2];
                                                    objArr2[i] = String.format(locale2, "WorkQueueTable [_id: %s, type: %s, rawdata: %s, attempts: %s, timestamp: %s, queue: %s, deduplication_tag: %s, scheduled_in_workmanager: %s, workmanager_id: %s, minimum_start_time: %s, cancellation_tag: %s]", objArr);
                                                    string = String.format(locale, "%s", objArr2);
                                                } catch (Throwable th11) {
                                                    th = th11;
                                                    th = th;
                                                    obj2 = obj4;
                                                    caxvVarA.close();
                                                    throw th;
                                                }
                                            } catch (Throwable th12) {
                                                th = th12;
                                                obj = obj5;
                                                th = th;
                                                obj2 = obj4;
                                                caxvVarA.close();
                                                throw th;
                                            }
                                        } else {
                                            obj = obj5;
                                            c = 3;
                                            c2 = 2;
                                            i3 = 4;
                                            string = obj6.toString();
                                        }
                                        long j2 = cbbiVar2.a;
                                        Locale locale3 = Locale.US;
                                        String str = string;
                                        Object[] objArr3 = new Object[1];
                                        objArr3[i] = Long.valueOf(j2 - j);
                                        String str2 = String.format(locale3, "%13d", objArr3);
                                        Locale locale4 = Locale.US;
                                        Long lValueOf = Long.valueOf(cbbiVar2.d);
                                        String strC = cbbj.c(cbbiVar2.e);
                                        Object[] objArr4 = new Object[i3];
                                        objArr4[i] = lValueOf;
                                        i2 = 1;
                                        objArr4[1] = str2;
                                        objArr4[c2] = strC;
                                        objArr4[c] = str;
                                        String str3 = String.format(locale4, "tid: %05d +%s %s: %s", objArr4);
                                        if (ekfdVar != null) {
                                            str3 = str3 + " [stack: " + String.valueOf(ekfdVar.get(Long.valueOf(cbbj.a(cbbiVar2.c)))) + "]";
                                        }
                                        caxwVar2.b(str3);
                                        j = j2;
                                        obj5 = obj;
                                    }
                                }
                                obj = obj5;
                                obj3 = null;
                                obj4 = null;
                                obj4 = null;
                                obj4 = null;
                                obj4 = null;
                                obj4 = null;
                                if (z2) {
                                    caxwVar2.b(a.e(ekfdVar.c, "Stack Dictionary: (count ", ")"));
                                    ekcb ekexVar = ekfdVar.g;
                                    if (ekexVar == null) {
                                        ekexVar = new ekex(ekfdVar);
                                        ekfdVar.g = ekexVar;
                                    }
                                    ekfb ekfbVar = new ekfb((ekfc) ekexVar.entrySet());
                                    while (ekfbVar.hasNext()) {
                                        Map.Entry entry = (Map.Entry) ekfbVar.next();
                                        caxwVar2.b("stack code " + String.valueOf(entry.getKey()));
                                        ArrayList arrayList = new ArrayList(cbbjVar.e);
                                        caxv caxvVarA4 = caxwVar2.a();
                                        try {
                                            StackTraceElement[] stackTraceElementArr = ((cbbi) arrayList.get(((Integer) entry.getKey()).intValue())).c;
                                            int length = stackTraceElementArr.length;
                                            for (int i11 = i; i11 < length; i11++) {
                                                caxwVar2.b(stackTraceElementArr[i11].toString());
                                            }
                                            caxvVarA4.close();
                                        } catch (Throwable th13) {
                                        }
                                    }
                                }
                                caxvVarA.close();
                                return obj3;
                            } catch (Throwable th14) {
                                th = th14;
                                obj = obj5;
                                obj4 = null;
                            }
                        } catch (Throwable th15) {
                            th = th15;
                            throw th;
                        }
                    } catch (Throwable th16) {
                        th = th16;
                    }
                }
                throw th;
            }
        };
        eosc eoscVar = this.c;
        return eijx.g(callable, eoscVar).i(new eooz() { // from class: cbap
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                EnumSet enumSet2 = enumSet;
                cazh cazhVar = cazh.DUMP_WM;
                if (!enumSet2.contains(cazhVar)) {
                    return eijx.e(null);
                }
                final Pattern pattern3 = pattern;
                final caxw caxwVar2 = caxwVar;
                cbay cbayVar = this.a;
                caxwVar2.d(cazhVar.toString());
                qbr qbrVarA = qbq.a(cbayVar.b);
                caxwVar2.b("PWQ WM State:");
                qee qeeVar = (qee) qbrVarA;
                WorkDatabase workDatabase = qeeVar.e;
                qmg qmgVar = qeeVar.m;
                workDatabase.getClass();
                qmgVar.getClass();
                return eiju.g(qlt.a(workDatabase, qmgVar, new qlp())).h(new ejvr() { // from class: cbar
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        caxw caxwVar3 = caxwVar2;
                        List<qbp> list = (List) obj2;
                        caxv caxvVarA = caxwVar3.a();
                        try {
                            for (qbp qbpVar : list) {
                                if (qbpVar.b != qbo.c) {
                                    Iterator it = qbpVar.c.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            caxwVar3.b("WM " + qbpVar.a.toString() + " ==> " + String.valueOf(qbpVar));
                                            break;
                                        }
                                        String str = (String) it.next();
                                        Pattern pattern4 = pattern3;
                                        if (pattern4 == null || pattern4.matcher(str).matches()) {
                                        }
                                    }
                                }
                            }
                            caxvVarA.close();
                            return null;
                        } catch (Throwable th) {
                            try {
                                caxvVarA.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }, cbayVar.c);
            }
        }, eoscVar).h(new ejvr() { // from class: cbaq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Void r2 = (Void) obj;
                caxwVar.c();
                return r2;
            }
        }, eoqg.a);
    }
}
