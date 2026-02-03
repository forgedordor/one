package defpackage;

import android.content.Context;
import android.os.Trace;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drmh {
    public static volatile drmh c;
    private final Map g = new csq();
    public static final ekrg a = ekrg.c("com/google/android/libraries/inputmethod/emoji/data/BundledEmojiListLoader");
    public static final int[] b = {R.string.emoji_category_recent, R.string.emoji_category_emotions, R.string.emoji_category_people, R.string.emoji_category_animals_nature, R.string.emoji_category_food_drink, R.string.emoji_category_travel_places, R.string.emoji_category_activity, R.string.emoji_category_objects, R.string.emoji_category_symbols, R.string.emoji_category_flags};
    private static final drjx e = new drjx();
    private static final drjx f = new drjx();
    static final drtr d = drtt.d("enable_emoji_loader_migration");

    static ekgb a(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        try {
            ejxk ejxkVarB = ejxk.b(',');
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    ekgb ekgbVarG = ekfwVar.g();
                    bufferedReader.close();
                    return ekgbVarG;
                }
                List listI = ejxkVarB.i(line);
                int size = listI.size();
                drna drnaVar = null;
                if (size != 0) {
                    if (size != 1) {
                        drnaVar = new drna((String) listI.get(0), ekgb.n(listI.subList(1, listI.size())));
                    } else {
                        String str = (String) listI.get(0);
                        if (!TextUtils.isEmpty(str)) {
                            drnaVar = new drna(str, ekoe.a);
                        }
                    }
                }
                if (drnaVar != null) {
                    ekfwVar.h(drnaVar);
                }
            }
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final synchronized ListenableFuture b(Context context, eosc eoscVar, final drsj drsjVar) {
        char c2;
        char c3;
        drmz drmzVar;
        final Context context2 = context;
        final eosc eoscVar2 = eoscVar;
        final drsj drsjVar2 = drsjVar;
        synchronized (this) {
            ListenableFuture listenableFuture = (ListenableFuture) this.g.get(drsjVar2);
            if (listenableFuture != null) {
                return listenableFuture;
            }
            plm.a("BundledEmojiListLoader.load");
            try {
                int i = ekgb.d;
                ekfw ekfwVar = new ekfw();
                char c4 = 1;
                List listB = drmw.b(context2, true != drsl.b(drsl.instance.j) ? R.array.emoji_list_raw_resources : R.array.emoji_list_raw_resources_with_gender_inclusive);
                ekfwVar.h(eork.i(ekoe.a));
                char c5 = 0;
                int i2 = 0;
                while (i2 < listB.size()) {
                    final int iIntValue = ((Integer) listB.get(i2)).intValue();
                    if (((Boolean) d.b()).booleanValue()) {
                        plm.a("BundledEmojiListLoader.loadFromFileBinaryStringCache");
                        try {
                            Locale locale = Locale.US;
                            Integer numValueOf = Integer.valueOf(drsjVar2.hashCode());
                            Integer numValueOf2 = Integer.valueOf(i2);
                            Integer numValueOf3 = Integer.valueOf(drsl.b(drsjVar2) ? 1 : 0);
                            Object[] objArr = new Object[3];
                            objArr[c5] = numValueOf;
                            objArr[c4] = numValueOf2;
                            objArr[2] = numValueOf3;
                            final String str = String.format(locale, "emoji-filter-flag.v2.%s.%d.%d", objArr);
                            final drkm drkmVar = (drkm) f.a(new ejxr() { // from class: drma
                                @Override // defpackage.ejxr
                                public final Object get() {
                                    ekrg ekrgVar = drmh.a;
                                    drke drkeVarF = drkh.f(context2);
                                    drkeVarF.d();
                                    drkeVarF.c();
                                    return new drkm(new drmc(drkeVarF), new drmg());
                                }
                            });
                            final ListenableFuture listenableFutureB = drkmVar.b(str, eoscVar2);
                            if (drmz.b == null) {
                                c2 = c4;
                                c3 = c5;
                                ((ekrd) drmz.a.a(drub.a).h("com/google/android/libraries/inputmethod/emoji/data/EmojiSetSupplier", "getInstance", 85, "EmojiSetSupplier.java")).q("EmojiSetSupplier#initialize() must be called before use.");
                                drmzVar = drmz.c;
                            } else {
                                c2 = c4;
                                c3 = c5;
                                drmzVar = drmz.b;
                            }
                            final ListenableFuture listenableFuture2 = drmzVar.d;
                            ListenableFuture[] listenableFutureArr = new ListenableFuture[2];
                            listenableFutureArr[c3] = listenableFutureB;
                            listenableFutureArr[c2] = listenableFuture2;
                            final eosc eoscVar3 = eoscVar2;
                            eoscVar2 = eoscVar3;
                            ListenableFuture listenableFutureA = eork.d(listenableFutureArr).a(new Callable() { // from class: drmd
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    ekrg ekrgVar = drmh.a;
                                    ekgb<drna> ekgbVar = (ekgb) ((ekgp) eork.q(listenableFuture2)).get(Integer.valueOf(iIntValue));
                                    if (ekgbVar == null) {
                                        int i3 = ekgb.d;
                                        return ekoe.a;
                                    }
                                    ekgb ekgbVarG = (ekgb) eork.q(listenableFutureB);
                                    if (ekgbVarG == null || ekgbVarG.size() != ekgbVar.size()) {
                                        drso.a();
                                        ekfw ekfwVar2 = new ekfw();
                                        for (drna drnaVar : ekgbVar) {
                                            drsj drsjVar3 = drsjVar;
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(true != drso.c(drnaVar.a, drsjVar3) ? '0' : '1');
                                            ekgb ekgbVar2 = drnaVar.b;
                                            int size = ekgbVar2.size();
                                            for (int i4 = 0; i4 < size; i4++) {
                                                sb.append(true != drso.c((String) ekgbVar2.get(i4), drsjVar3) ? '0' : '1');
                                            }
                                            ekfwVar2.h(sb.toString());
                                        }
                                        eosc eoscVar4 = eoscVar3;
                                        String str2 = str;
                                        drkm drkmVar2 = drkmVar;
                                        ekgbVarG = ekfwVar2.g();
                                        drkmVar2.d(str2, ekgbVarG, eoscVar4);
                                    }
                                    ekfw ekfwVar3 = new ekfw();
                                    for (int i5 = 0; i5 < ekgbVarG.size(); i5++) {
                                        String str3 = (String) ekgbVarG.get(i5);
                                        if (!str3.isEmpty()) {
                                            drna drnaVar2 = (drna) ekgbVar.get(i5);
                                            if (str3.indexOf(48) == -1) {
                                                ekfwVar3.h(drnaVar2);
                                            } else if (str3.indexOf(49) != -1) {
                                                ekfw ekfwVar4 = new ekfw();
                                                for (int i6 = 1; i6 < str3.length(); i6++) {
                                                    if (str3.charAt(i6) == '1') {
                                                        ekfwVar4.h((String) drnaVar2.b.get(i6 - 1));
                                                    }
                                                }
                                                ekgb ekgbVarG2 = ekfwVar4.g();
                                                if (str3.charAt(0) == '1') {
                                                    String str4 = drnaVar2.a;
                                                    if (((ekoe) ekgbVarG2).c == 1) {
                                                        ekgbVarG2 = ekoe.a;
                                                    }
                                                    ekfwVar3.h(new drna(str4, ekgbVarG2));
                                                } else {
                                                    int i7 = ((ekoe) ekgbVarG2).c;
                                                    if (i7 > 0) {
                                                        String str5 = (String) ekgbVarG2.get(0);
                                                        if (i7 == 1) {
                                                            ekgbVarG2 = ekoe.a;
                                                        }
                                                        ekfwVar3.h(new drna(str5, ekgbVarG2));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return ekfwVar3.g();
                                }
                            }, eoscVar2);
                            Trace.endSection();
                            ekfwVar.h(listenableFutureA);
                            drsjVar2 = drsjVar;
                            i2++;
                            context2 = context;
                            c4 = c2;
                            c5 = c3;
                        } finally {
                        }
                    } else {
                        c2 = c4;
                        c3 = c5;
                        plm.a("BundledEmojiListLoader.loadFromFile");
                        try {
                            Locale locale2 = Locale.US;
                            Integer numValueOf4 = Integer.valueOf(drsjVar.hashCode());
                            Integer numValueOf5 = Integer.valueOf(i2);
                            Integer numValueOf6 = Integer.valueOf(drsl.b(drsjVar) ? 1 : 0);
                            Object[] objArr2 = new Object[3];
                            objArr2[c3] = numValueOf4;
                            objArr2[c2] = numValueOf5;
                            objArr2[2] = numValueOf6;
                            final String str2 = String.format(locale2, "emoji.v2.%s.%d.%d", objArr2);
                            final drkm drkmVar2 = (drkm) e.a(new ejxr() { // from class: drme
                                @Override // defpackage.ejxr
                                public final Object get() {
                                    ekrg ekrgVar = drmh.a;
                                    drke drkeVarF = drkh.f(context2);
                                    drkeVarF.d();
                                    drkeVarF.c();
                                    return new drkm(new drmc(drkeVarF), new drmf());
                                }
                            });
                            drsjVar2 = drsjVar;
                            ListenableFuture listenableFutureG = eooq.g(drkmVar2.b(str2, eoscVar2), new eooz() { // from class: drmb
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj) {
                                    ekgb ekgbVar = (ekgb) obj;
                                    ekrg ekrgVar = drmh.a;
                                    eosc eoscVar4 = eoscVar2;
                                    drkm drkmVar3 = drkmVar2;
                                    String str3 = str2;
                                    drsj drsjVar3 = drsjVar2;
                                    int i3 = iIntValue;
                                    Context context3 = context2;
                                    if (ekgbVar != null && !ekgbVar.isEmpty()) {
                                        ((ekrd) ((ekrd) drmh.a.g()).h("com/google/android/libraries/inputmethod/emoji/data/BundledEmojiListLoader", "loadFromFile", 231, "BundledEmojiListLoader.java")).q("Using emoji list from renderability cache");
                                        return eork.i(ekgbVar);
                                    }
                                    ((ekrd) ((ekrd) drmh.a.g()).h("com/google/android/libraries/inputmethod/emoji/data/BundledEmojiListLoader", "loadFromFile", 234, "BundledEmojiListLoader.java")).q("Did not find emoji list in renderability cache");
                                    try {
                                        ekgb ekgbVarA = drmh.a(context3.getResources().openRawResource(i3));
                                        drso.a();
                                        int i4 = ekgb.d;
                                        ekfw ekfwVar2 = new ekfw();
                                        ekqh it = ekgbVarA.iterator();
                                        while (it.hasNext()) {
                                            drna drnaVar = (drna) it.next();
                                            ekgb ekgbVarD = drso.d(drnaVar.b, drsjVar3);
                                            String str4 = drnaVar.a;
                                            if (drso.c(str4, drsjVar3)) {
                                                if (((ekoe) ekgbVarD).c == 1) {
                                                    ekgbVarD = ekoe.a;
                                                }
                                                ekfwVar2.h(new drna(str4, ekgbVarD));
                                            } else {
                                                int i5 = ((ekoe) ekgbVarD).c;
                                                if (i5 > 0) {
                                                    String str5 = (String) ekgbVarD.get(0);
                                                    if (i5 == 1) {
                                                        ekgbVarD = ekoe.a;
                                                    }
                                                    ekfwVar2.h(new drna(str5, ekgbVarD));
                                                }
                                            }
                                        }
                                        ekgb ekgbVarG = ekfwVar2.g();
                                        drkmVar3.d(str3, ekgbVarG, eoscVar4);
                                        return eork.i(ekgbVarG);
                                    } catch (IOException e2) {
                                        ((ekrd) ((ekrd) ((ekrd) drmh.a.i()).g(e2)).h("com/google/android/libraries/inputmethod/emoji/data/BundledEmojiListLoader", "loadFromFile", 242, "BundledEmojiListLoader.java")).t("error save to emoji cache file: %s", str3);
                                        int i6 = ekgb.d;
                                        return eork.i(ekoe.a);
                                    }
                                }
                            }, eoscVar2);
                            Trace.endSection();
                            ekfwVar.h(listenableFutureG);
                            i2++;
                            context2 = context;
                            c4 = c2;
                            c5 = c3;
                        } finally {
                        }
                    }
                }
                ListenableFuture listenableFutureE = eork.e(ekfwVar.g());
                Trace.endSection();
                this.g.put(drsjVar2, listenableFutureE);
                return listenableFutureE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
