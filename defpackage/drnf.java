package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drnf implements droa {
    public static final ekrg a = ekrg.c("com/google/android/libraries/inputmethod/emoji/data/EmojiVariantDataProvider");
    public static final droh b;
    public static final ekgb c;
    public static final ekgb d;
    public static final ekgp e;
    private static volatile drnf l;
    public final AtomicReference f;
    public final AtomicReference g;
    public final AtomicReference h;
    public final AtomicReference i;
    public final AtomicReference j;
    public ListenableFuture k;
    private final Executor m;

    static {
        drog drogVar = (drog) droh.a.createBuilder();
        droe droeVar = (droe) drof.a.createBuilder();
        droeVar.copyOnWrite();
        drof drofVar = (drof) droeVar.instance;
        drofVar.c = 0;
        drofVar.b = 1;
        drogVar.b((drof) droeVar.build());
        droe droeVar2 = (droe) drof.a.createBuilder();
        droeVar2.copyOnWrite();
        drof drofVar2 = (drof) droeVar2.instance;
        drofVar2.c = 0;
        drofVar2.b = 2;
        drogVar.b((drof) droeVar2.build());
        b = (droh) drogVar.build();
        Integer numValueOf = Integer.valueOf(R.raw.emoji_category_emotions);
        c = ekgb.s(numValueOf, Integer.valueOf(R.raw.emoji_category_people_gender_inclusive));
        d = ekgb.s(numValueOf, Integer.valueOf(R.raw.emoji_category_people));
        drog drogVar2 = (drog) droh.a.createBuilder();
        droe droeVar3 = (droe) drof.a.createBuilder();
        droeVar3.copyOnWrite();
        drof drofVar3 = (drof) droeVar3.instance;
        drofVar3.c = 1;
        drofVar3.b = 2;
        drogVar2.b((drof) droeVar3.build());
        droh drohVar = (droh) drogVar2.build();
        drog drogVar3 = (drog) droh.a.createBuilder();
        droe droeVar4 = (droe) drof.a.createBuilder();
        droeVar4.copyOnWrite();
        drof drofVar4 = (drof) droeVar4.instance;
        drofVar4.c = 3;
        drofVar4.b = 2;
        drogVar3.b((drof) droeVar4.build());
        droh drohVar2 = (droh) drogVar3.build();
        drog drogVar4 = (drog) droh.a.createBuilder();
        droe droeVar5 = (droe) drof.a.createBuilder();
        droeVar5.copyOnWrite();
        drof drofVar5 = (drof) droeVar5.instance;
        drofVar5.c = 2;
        drofVar5.b = 2;
        drogVar4.b((drof) droeVar5.build());
        e = ekgp.l("👯", ekgb.t(drohVar, drohVar2, (droh) drogVar4.build()));
    }

    private drnf(Executor executor) {
        ekgp ekgpVar = ekoj.a;
        this.f = new AtomicReference(ekgpVar);
        this.g = new AtomicReference(ekgpVar);
        this.h = new AtomicReference(ekgpVar);
        ekdy ekdyVar = ekdy.a;
        this.i = new AtomicReference(ekdyVar);
        this.j = new AtomicReference(ekdyVar);
        this.m = executor;
    }

    public static drnf e(final Context context) {
        drnf drnfVar;
        drnf drnfVar2 = l;
        if (drnfVar2 != null) {
            return drnfVar2;
        }
        synchronized (drnf.class) {
            drnfVar = l;
            if (drnfVar == null) {
                final drnf drnfVar3 = new drnf(drle.a().e);
                Callable callable = new Callable() { // from class: drnd
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws IOException {
                        ekrg ekrgVar = drnf.a;
                        int i = ekgb.d;
                        ekfw ekfwVar = new ekfw();
                        boolean zB = drsl.b(drsl.instance.j);
                        Context context2 = context;
                        ekgb ekgbVar = zB ? drnf.c : drnf.d;
                        for (int i2 = 0; i2 < ((ekoe) ekgbVar).c; i2++) {
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context2.getResources().openRawResource(((Integer) ekgbVar.get(i2)).intValue()), StandardCharsets.UTF_8));
                                while (true) {
                                    try {
                                        String line = bufferedReader.readLine();
                                        if (line == null) {
                                            break;
                                        }
                                        List listI = ejxk.b(',').i(line);
                                        if (listI.size() > 1) {
                                            ekfwVar.h(ekgb.n(listI));
                                        }
                                    } finally {
                                    }
                                }
                                bufferedReader.close();
                            } catch (IOException e2) {
                                ((ekrd) ((ekrd) drnf.a.i()).h("com/google/android/libraries/inputmethod/emoji/data/EmojiVariantDataProvider", "loadVariantsMapsFromDisk", 295, "EmojiVariantDataProvider.java")).q("Failed to load emoji variation data.");
                                throw e2;
                            }
                        }
                        return ekfwVar.g();
                    }
                };
                Executor executor = drnfVar3.m;
                ListenableFuture listenableFutureF = eooq.f(eork.m(callable, executor), new ejvr() { // from class: drnc
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:6:0x002d  */
                    /* JADX WARN: Removed duplicated region for block: B:75:0x02a4  */
                    /* JADX WARN: Removed duplicated region for block: B:93:0x02b6 A[SYNTHETIC] */
                    @Override // defpackage.ejvr
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object apply(java.lang.Object r25) {
                        /*
                            Method dump skipped, instructions count: 839
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.drnc.apply(java.lang.Object):java.lang.Object");
                    }
                }, executor);
                drnfVar3.k = listenableFutureF;
                eork.r(listenableFutureF, new drne(), executor);
                l = drnfVar3;
                drnfVar = drnfVar3;
            }
        }
        return drnfVar;
    }

    public final drnz a(String str) {
        return (drnz) ((ekgp) this.f.get()).get(d(str));
    }

    public final droh b(String str) {
        return (droh) ((ekgp) this.h.get()).get(str);
    }

    @Override // defpackage.droa
    public final ekgb c(String str) {
        if (!drnl.a(this.k)) {
            int i = ekgb.d;
            return ekoe.a;
        }
        ekgb ekgbVarA = ((ekgd) this.i.get()).a(d(str));
        if (ekgbVarA != null) {
            return ekgbVarA;
        }
        int i2 = ekgb.d;
        return ekoe.a;
    }

    @Override // defpackage.droa
    public final String d(String str) {
        String str2;
        return (drnl.a(this.k) && (str2 = (String) ekis.m(((ekgd) this.j.get()).a(str), null)) != null) ? str2 : str;
    }
}
