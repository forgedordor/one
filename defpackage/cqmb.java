package defpackage;

import android.content.Context;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.TextUtils;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqmb {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/emoji/EmojiUtils");
    private static final List c;
    private static final List d;
    private static final List e;
    private static final List f;
    public lok b;
    private final cplc g;
    private final log h;
    private final lpu i;

    static {
        ArrayList arrayList = new ArrayList();
        c = arrayList;
        d = new ArrayList();
        e = new ArrayList();
        f = new ArrayList();
        arrayList.add(35);
        arrayList.add(42);
        for (int i = 0; i <= 9; i++) {
            c.add(Integer.valueOf(i + 48));
        }
        List list = d;
        list.add(65038);
        list.add(65039);
        list.add(8205);
        List list2 = e;
        list2.add(8294);
        list2.add(8297);
        List list3 = f;
        list3.add(127995);
        list3.add(127996);
        list3.add(127997);
        list3.add(127998);
        list3.add(127999);
        list3.add(8205);
        list3.add(65038);
        list3.add(65039);
    }

    public cqmb(Context context) {
        ejxx.a(new ejxr() { // from class: cqlx
            @Override // defpackage.ejxr
            public final Object get() {
                return new TextPaint();
            }
        });
        this.g = new cplc();
        this.h = new cqly(this);
        this.i = new cqlz();
        if (craf.g(context)) {
            lat latVar = new lat("Noto Color Emoji Compat");
            los losVar = new los(context, latVar);
            List list = c;
            losVar.c = true;
            int i = 0;
            if (list != null) {
                losVar.d = new int[list.size()];
                Iterator it = list.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    losVar.d[i2] = ((Integer) it.next()).intValue();
                    i2++;
                }
                Arrays.sort(losVar.d);
            } else {
                losVar.d = null;
            }
            losVar.a(this.h);
            lqk lqkVar = new lqk(context, latVar);
            lqkVar.b = true;
            if (list != null) {
                lqkVar.c = new int[list.size()];
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    lqkVar.c[i] = ((Integer) it2.next()).intValue();
                    i++;
                }
                Arrays.sort(lqkVar.c);
            } else {
                lqkVar.c = null;
            }
            lpu lpuVar = this.i;
            Executor executorA = lpn.a();
            lcg.j(lpuVar, "initCallback cannot be null");
            if (lqkVar.d == null) {
                lqkVar.d = new css();
            }
            lqkVar.d.add(new lpx(executorA, lpuVar));
            if (((Boolean) ccze.ac.e()).booleanValue()) {
                losVar.b = true;
                lqkVar.a = true;
            }
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/util/emoji/EmojiUtils", "emojiInit", 164, "EmojiUtils.java")).q("Initializing EmojiCompat");
            lok.h(losVar);
            if (lpz.b == null) {
                synchronized (lpz.a) {
                    if (lpz.b == null) {
                        lpz.b = new lpz(lqkVar);
                    }
                }
            }
        }
    }

    public static boolean d(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            int iCodePointAt = Character.codePointAt(charSequence, i);
            if (iCodePointAt != 10 && iCodePointAt != 32 && !e.contains(Integer.valueOf(iCodePointAt))) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final lcb a(String str) {
        ekgb ekgbVar;
        if (f()) {
            CharSequence charSequenceC = this.b.c(str);
            if (charSequenceC instanceof Spannable) {
                final Spannable spannable = (Spannable) charSequenceC;
                Stream streamSorted = DesugarArrays.stream((lop[]) spannable.getSpans(0, spannable.length(), lop.class)).map(new Function() { // from class: cqlw
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        lop lopVar = (lop) obj;
                        ekrg ekrgVar = cqmb.a;
                        Spannable spannable2 = spannable;
                        int spanStart = spannable2.getSpanStart(lopVar);
                        int spanEnd = spannable2.getSpanEnd(lopVar);
                        ejwl.l(spanStart < spanEnd);
                        return new cqma(spanStart, spanEnd);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).sorted();
                int i = ekgb.d;
                ekgbVar = (ekgb) streamSorted.collect(ekcv.a);
            } else {
                int i2 = ekgb.d;
                ekgbVar = ekoe.a;
            }
        } else {
            ekgbVar = null;
        }
        if (ekgbVar == null) {
            return new lcb(-1, -1);
        }
        int size = ekgbVar.size();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            cqma cqmaVar = (cqma) ekgbVar.get(i5);
            int i6 = cqmaVar.a;
            ejwl.l(i6 >= i4);
            i3 += i6 - i4;
            i4 = cqmaVar.b;
        }
        return new lcb(Integer.valueOf(ekgbVar.size()), Integer.valueOf(i3 + (str.length() - i4)));
    }

    public final eloi b(final String str, final boolean z) {
        Object objInvoke;
        cqlu cqluVar = new cqlu(str, z);
        fdae fdaeVar = new fdae() { // from class: cqlv
            @Override // defpackage.fdae
            public final Object invoke() {
                lcb lcbVar;
                boolean z2 = z;
                cqmb cqmbVar = this.a;
                if (cqmbVar.f()) {
                    String str2 = str;
                    int i = 0;
                    if (TextUtils.isEmpty(str2)) {
                        lcbVar = new lcb(0, 0);
                    } else {
                        lok lokVar = cqmbVar.b;
                        if (lokVar == null) {
                            lcbVar = new lcb(-1, -1);
                        } else {
                            CharSequence charSequenceC = lokVar.c(str2);
                            if (charSequenceC instanceof Spannable) {
                                Spannable spannable = (Spannable) charSequenceC;
                                lop[] lopVarArr = (lop[]) spannable.getSpans(0, spannable.length(), lop.class);
                                int length = lopVarArr.length;
                                int i2 = 0;
                                int length2 = 0;
                                while (true) {
                                    if (i < length) {
                                        lop lopVar = lopVarArr[i];
                                        int spanStart = spannable.getSpanStart(lopVar);
                                        int spanEnd = spannable.getSpanEnd(lopVar);
                                        if (i2 != spanStart && !cqmb.d(str2, i2, spanStart)) {
                                            length2 += spanStart - i2;
                                            if (z2) {
                                                lcbVar = new lcb(Integer.valueOf(lopVarArr.length), Integer.valueOf(length2));
                                                z2 = true;
                                                break;
                                            }
                                        }
                                        i++;
                                        i2 = spanEnd;
                                    } else {
                                        if (i2 != spannable.length() && !cqmb.d(str2, i2, spannable.length())) {
                                            length2 += spannable.length() - i2;
                                        }
                                        lcbVar = new lcb(Integer.valueOf(lopVarArr.length), Integer.valueOf(length2));
                                    }
                                }
                            } else {
                                lcbVar = new lcb(-1, -1);
                            }
                        }
                    }
                } else {
                    lcbVar = new lcb(-1, -1);
                }
                Object obj = lcbVar.b;
                Integer num = (Integer) lcbVar.a;
                Integer num2 = (Integer) obj;
                if (num == null || num2 == null) {
                    return eloi.UNKNOWN_EMOJI_STATUS;
                }
                int iIntValue = num.intValue();
                int iIntValue2 = num2.intValue();
                if (iIntValue < 0 || iIntValue2 < 0) {
                    return eloi.UNKNOWN_EMOJI_STATUS;
                }
                if (z2 && iIntValue2 > 0) {
                    return eloi.EMOJI_STATUS_NO_EMOJI;
                }
                if (iIntValue == 1) {
                    if (iIntValue2 == 0) {
                        return eloi.EMOJI_STATUS_SINGLE_EMOJI_ONLY;
                    }
                } else if (iIntValue <= 0) {
                    return eloi.EMOJI_STATUS_NO_EMOJI;
                }
                return iIntValue2 > 0 ? eloi.EMOJI_STATUS_SOME_EMOJI : eloi.EMOJI_STATUS_ALL_EMOJI;
            }
        };
        cplc cplcVar = this.g;
        synchronized (cplcVar.b) {
            cplb cplbVar = cplcVar.a;
            objInvoke = cplbVar.get(cqluVar);
            if (objInvoke == null) {
                objInvoke = fdaeVar.invoke();
            }
            cplbVar.remove(cqluVar);
            cplbVar.put(cqluVar, objInvoke);
        }
        return (eloi) objInvoke;
    }

    public final List c(String str) {
        if (!f()) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/util/emoji/EmojiUtils", "getEmojisListUsingEmojiCompat", 350, "EmojiUtils.java")).q("Bugle: EmojiCompat initialization failed");
            int i = ekgb.d;
            return ekoe.a;
        }
        if (TextUtils.isEmpty(str)) {
            int i2 = ekgb.d;
            return ekoe.a;
        }
        CharSequence charSequenceC = this.b.c(str);
        if (!(charSequenceC instanceof Spannable)) {
            int i3 = ekgb.d;
            return ekoe.a;
        }
        ArrayList arrayList = new ArrayList();
        Spannable spannable = (Spannable) charSequenceC;
        int i4 = 0;
        lop[] lopVarArr = (lop[]) spannable.getSpans(0, spannable.length(), lop.class);
        int length = lopVarArr.length;
        int i5 = 0;
        while (i4 < length) {
            lop lopVar = lopVarArr[i4];
            int spanStart = spannable.getSpanStart(lopVar);
            int spanEnd = spannable.getSpanEnd(lopVar);
            if (i5 != spanStart && !d(str, i5, spanStart)) {
                int i6 = ekgb.d;
                return ekoe.a;
            }
            arrayList.add(str.substring(spanStart, spanEnd));
            i4++;
            i5 = spanEnd;
        }
        if (i5 == str.length() || d(str, i5, str.length())) {
            return ekgb.n(arrayList);
        }
        int i7 = ekgb.d;
        return ekoe.a;
    }

    public final boolean e(CharSequence charSequence) {
        lok lokVar = this.b;
        if (lokVar == null) {
            return false;
        }
        lcg.d(lokVar.g(), "Not initialized yet");
        lcg.j(charSequence, "sequence cannot be null");
        return lokVar.e.a.a(charSequence) != null;
    }

    public final boolean f() {
        return this.b != null;
    }

    public final boolean g(CharSequence charSequence) {
        eloi eloiVarB = b(charSequence.toString(), true);
        return eloiVarB == eloi.EMOJI_STATUS_SINGLE_EMOJI_ONLY || eloiVarB == eloi.EMOJI_STATUS_ALL_EMOJI;
    }
}
