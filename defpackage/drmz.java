package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drmz implements ejxr {
    public static volatile drmz b;
    public final ListenableFuture d;
    private final Future e;
    private volatile ekhx f;
    public static final ekrg a = ekrg.c("com/google/android/libraries/inputmethod/emoji/data/EmojiSetSupplier");
    public static final drmz c = new drmz(eork.i(new ekhv().g()));

    public drmz(final Context context, Executor executor) {
        Executor executorB = drle.b(executor);
        ListenableFuture listenableFutureM = eork.m(new Callable() { // from class: drmy
            @Override // java.util.concurrent.Callable
            public final Object call() throws Resources.NotFoundException, IOException {
                ekrg ekrgVar = drmz.a;
                Context context2 = context;
                Resources resources = context2.getResources();
                ekgi ekgiVar = new ekgi();
                List<Integer> listB = drmw.b(context2, drmw.a());
                ejxk ejxkVarB = ejxk.b(',');
                for (Integer num : listB) {
                    int iIntValue = num.intValue();
                    int i = ekgb.d;
                    ekfw ekfwVar = new ekfw();
                    try {
                        InputStreamReader inputStreamReader = new InputStreamReader(resources.openRawResource(iIntValue), StandardCharsets.UTF_8);
                        try {
                            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                            while (true) {
                                try {
                                    String line = bufferedReader.readLine();
                                    if (line == null) {
                                        break;
                                    }
                                    List listI = ejxkVarB.i(line);
                                    if (listI.size() == 1) {
                                        ekfwVar.h(new drna((String) listI.get(0), ekoe.a));
                                    } else if (listI.size() >= 2) {
                                        ekfwVar.h(new drna((String) listI.get(0), ekgb.n(listI.subList(1, listI.size()))));
                                    }
                                } catch (Throwable th) {
                                    try {
                                        bufferedReader.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                }
                            }
                            bufferedReader.close();
                            inputStreamReader.close();
                            ekgiVar.i(num, ekfwVar.g());
                        } catch (Throwable th3) {
                            try {
                                inputStreamReader.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (IOException e) {
                        ((ekrd) ((ekrd) ((ekrd) drmz.a.i()).g(e)).h("com/google/android/libraries/inputmethod/emoji/data/EmojiSetSupplier", "getDefaultEmojiVariantList", (char) 216, "EmojiSetSupplier.java")).q("Reading emoji list failed.");
                        return ekoj.a;
                    }
                }
                return ekgiVar.c();
            }
        }, executorB);
        this.d = listenableFutureM;
        this.e = eooq.f(listenableFutureM, new ejvr() { // from class: drmx
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i;
                ekgp ekgpVar = (ekgp) obj;
                ekrg ekrgVar = drmz.a;
                ekhv ekhvVar = new ekhv();
                for (Integer num : drmw.b(context, drmw.a())) {
                    num.intValue();
                    ekgb ekgbVar = (ekgb) ekgpVar.get(num);
                    if (ekgbVar != null) {
                        int size = ekgbVar.size();
                        int i2 = 0;
                        while (i2 < size) {
                            drna drnaVar = (drna) ekgbVar.get(i2);
                            String str = drnaVar.a;
                            ekhvVar.c(str);
                            ekhvVar.c(str);
                            ekgb ekgbVar2 = drnaVar.b;
                            int size2 = ekgbVar2.size();
                            int i3 = 0;
                            while (true) {
                                i = i2 + 1;
                                if (i3 < size2) {
                                    ekhvVar.c((String) ekgbVar2.get(i3));
                                    i3++;
                                }
                            }
                            i2 = i;
                        }
                    }
                }
                return ekhvVar.g();
            }
        }, executorB);
    }

    @Override // defpackage.ejxr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ekhx get() {
        drxt drxtVar = new drxt("EmojiSetSupplier.get");
        try {
            if (this.f == null) {
                synchronized (this) {
                    if (this.f == null) {
                        try {
                            this.f = (ekhx) this.e.get(10L, TimeUnit.SECONDS);
                        } catch (InterruptedException | ExecutionException | TimeoutException e) {
                            ((ekrd) ((ekrd) ((ekrd) a.i()).g(e)).h("com/google/android/libraries/inputmethod/emoji/data/EmojiSetSupplier", "get", 127, "EmojiSetSupplier.java")).q("Reading emoji list failed.");
                            this.f = ekon.a;
                        }
                    }
                }
            }
            ekhx ekhxVar = this.f;
            drxtVar.close();
            return ekhxVar;
        } catch (Throwable th) {
            try {
                drxtVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public drmz(Future future) {
        this.e = future;
        this.d = eork.i(ekoj.a);
    }
}
