package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import androidx.car.app.model.Alert;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpz {
    public static final Object a = new Object();
    public static volatile lpz b;
    public final ReadWriteLock c;
    public final Set d;
    public volatile int e;
    public final lpq f;
    final boolean g;
    final boolean h;
    final int[] i;
    public final lpt j;
    public final lps k;
    final lqj l;

    public lpz(lpr lprVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.c = reentrantReadWriteLock;
        this.e = 3;
        this.g = lprVar.a;
        this.h = lprVar.b;
        this.i = lprVar.c;
        this.l = lprVar.f;
        this.j = lprVar.e;
        css cssVar = new css();
        this.d = cssVar;
        this.k = new lps();
        Set set = lprVar.d;
        if (set != null && !set.isEmpty()) {
            cssVar.addAll(set);
        }
        lpq lpqVar = new lpq(this);
        this.f = lpqVar;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.e = 0;
            reentrantReadWriteLock.writeLock().unlock();
            if (b() == 0) {
                try {
                    lpp lppVar = new lpp(lpqVar);
                    final lqj lqjVar = lpqVar.c.l;
                    synchronized (lqjVar.c) {
                        lqjVar.f = lppVar;
                    }
                    synchronized (lqjVar.c) {
                        if (lqjVar.f == null) {
                            return;
                        }
                        if (lqjVar.d == null) {
                            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: lpm
                                public final /* synthetic */ String a = "emojiCompat";

                                @Override // java.util.concurrent.ThreadFactory
                                public final Thread newThread(Runnable runnable) {
                                    Thread thread = new Thread(runnable, this.a);
                                    thread.setPriority(10);
                                    return thread;
                                }
                            });
                            threadPoolExecutor.allowCoreThreadTimeOut(true);
                            lqjVar.e = threadPoolExecutor;
                            lqjVar.d = lqjVar.e;
                        }
                        lqjVar.d.execute(new Runnable() { // from class: lqi
                            @Override // java.lang.Runnable
                            public final void run() {
                                long jA;
                                int i;
                                lqj lqjVar2 = lqjVar;
                                synchronized (lqjVar2.c) {
                                    if (lqjVar2.f == null) {
                                        return;
                                    }
                                    try {
                                        try {
                                            lbc lbcVarC = lbf.c(lqjVar2.a, lqjVar2.b);
                                            if (lbcVarC.a != 0) {
                                                throw new RuntimeException("fetchFonts failed (1)");
                                            }
                                            lbd[] lbdVarArrA = lbcVarC.a();
                                            if (lbdVarArrA == null || lbdVarArrA.length == 0) {
                                                throw new RuntimeException("fetchFonts failed (empty result)");
                                            }
                                            lbd lbdVar = lbdVarArrA[0];
                                            int i2 = lbdVar.e;
                                            if (i2 == 2) {
                                                synchronized (lqjVar2.c) {
                                                }
                                                i2 = 2;
                                            }
                                            if (i2 != 0) {
                                                throw new RuntimeException(a.e(i2, "fetchFonts result is not OK. (", ")"));
                                            }
                                            try {
                                                int i3 = lak.a;
                                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                                Context context = lqjVar2.a;
                                                Typeface typefaceB = lbf.b(context, new lbd[]{lbdVar});
                                                ByteBuffer byteBufferE = kzr.e(context, lbdVar.a);
                                                if (byteBufferE == null || typefaceB == null) {
                                                    throw new RuntimeException("Unable to open file.");
                                                }
                                                try {
                                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                                    ByteBuffer byteBufferDuplicate = byteBufferE.duplicate();
                                                    byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
                                                    lql.b(4, byteBufferDuplicate);
                                                    char c = (char) byteBufferDuplicate.getShort();
                                                    if (c > 'd') {
                                                        throw new IOException("Cannot read metadata.");
                                                    }
                                                    lql.b(6, byteBufferDuplicate);
                                                    int i4 = 0;
                                                    while (true) {
                                                        if (i4 >= c) {
                                                            jA = -1;
                                                            break;
                                                        }
                                                        int i5 = byteBufferDuplicate.getInt();
                                                        lql.b(4, byteBufferDuplicate);
                                                        jA = lql.a(byteBufferDuplicate);
                                                        lql.b(4, byteBufferDuplicate);
                                                        if (i5 == 1835365473) {
                                                            break;
                                                        } else {
                                                            i4++;
                                                        }
                                                    }
                                                    if (jA != -1) {
                                                        lql.b((int) (jA - byteBufferDuplicate.position()), byteBufferDuplicate);
                                                        lql.b(12, byteBufferDuplicate);
                                                        long jA2 = lql.a(byteBufferDuplicate);
                                                        for (0; i < jA2; i + 1) {
                                                            int i6 = byteBufferDuplicate.getInt();
                                                            long jA3 = lql.a(byteBufferDuplicate);
                                                            lql.a(byteBufferDuplicate);
                                                            i = (i6 == 1164798569 || i6 == 1701669481) ? 0 : i + 1;
                                                            byteBufferDuplicate.position((int) (jA3 + jA));
                                                            lqw lqwVar = new lqw();
                                                            byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                                                            lqwVar.e(byteBufferDuplicate.getInt(byteBufferDuplicate.position()) + byteBufferDuplicate.position(), byteBufferDuplicate);
                                                            lqn lqnVar = new lqn(typefaceB, lqwVar);
                                                            Trace.endSection();
                                                            synchronized (lqjVar2.c) {
                                                                lpy lpyVar = lqjVar2.f;
                                                                if (lpyVar != null) {
                                                                    lpq lpqVar2 = ((lpp) lpyVar).a;
                                                                    lpqVar2.b = lqnVar;
                                                                    lqn lqnVar2 = lpqVar2.b;
                                                                    lpz lpzVar = lpqVar2.c;
                                                                    lpqVar2.a = new lqg(lqnVar2, lpzVar.k, lpzVar.j, lpzVar.h, lpzVar.i, Build.VERSION.SDK_INT >= 34 ? lqa.a() : lqa.a());
                                                                    Set set2 = lpzVar.d;
                                                                    ArrayList arrayList = new ArrayList(((css) set2).c);
                                                                    lpzVar.c.writeLock().lock();
                                                                    try {
                                                                        lpzVar.e = 1;
                                                                        arrayList.addAll(set2);
                                                                        set2.clear();
                                                                        for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                                                            ((lpx) arrayList.get(i7)).b();
                                                                        }
                                                                    } finally {
                                                                        lpzVar.c.writeLock().unlock();
                                                                    }
                                                                }
                                                            }
                                                            lqjVar2.a();
                                                            return;
                                                        }
                                                    }
                                                    throw new IOException("Cannot read metadata.");
                                                } finally {
                                                    Trace.endSection();
                                                }
                                            } catch (Throwable th) {
                                                int i8 = lak.a;
                                                throw th;
                                            }
                                        } catch (PackageManager.NameNotFoundException e) {
                                            throw new RuntimeException("provider not found", e);
                                        }
                                    } catch (Throwable th2) {
                                        synchronized (lqjVar2.c) {
                                            lpy lpyVar2 = lqjVar2.f;
                                            if (lpyVar2 != null) {
                                                ((lpp) lpyVar2).a.c.e(th2);
                                            }
                                            lqjVar2.a();
                                        }
                                    }
                                }
                            }
                        });
                    }
                } catch (Throwable th) {
                    lpqVar.c.e(th);
                }
            }
        } catch (Throwable th2) {
            this.c.writeLock().unlock();
            throw th2;
        }
    }

    public static lpz c() {
        lpz lpzVar;
        synchronized (a) {
            lpzVar = b;
            lcg.d(lpzVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return lpzVar;
    }

    public static boolean h() {
        return b != null;
    }

    public final int a(CharSequence charSequence, int i) {
        lcg.d(i(), "Not initialized yet");
        lcg.j(charSequence, "charSequence cannot be null");
        lqg lqgVar = this.f.a;
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            lqh[] lqhVarArr = (lqh[]) spanned.getSpans(i, i + 1, lqh.class);
            if (lqhVarArr.length > 0) {
                return spanned.getSpanStart(lqhVarArr[0]);
            }
        }
        return ((lqd) lqgVar.a(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Alert.DURATION_SHOW_INDEFINITELY, true, new lqd(i))).a;
    }

    public final int b() {
        this.c.readLock().lock();
        try {
            return this.e;
        } finally {
            this.c.readLock().unlock();
        }
    }

    public final CharSequence d(CharSequence charSequence) {
        return j(charSequence, charSequence == null ? 0 : charSequence.length());
    }

    final void e(Throwable th) {
        Set set = this.d;
        ArrayList arrayList = new ArrayList(((css) set).c);
        this.c.writeLock().lock();
        try {
            this.e = 2;
            arrayList.addAll(set);
            set.clear();
            this.c.writeLock().unlock();
            for (int i = 0; i < arrayList.size(); i++) {
                ((lpx) arrayList.get(i)).a(th);
            }
        } catch (Throwable th2) {
            this.c.writeLock().unlock();
            throw th2;
        }
    }

    public final void f(lpu lpuVar) {
        Executor executorA = lpn.a();
        lcg.j(lpuVar, "initCallback cannot be null");
        lpx lpxVar = new lpx(executorA, lpuVar);
        this.c.writeLock().lock();
        try {
            if (this.e == 1) {
                lpxVar.b();
            } else if (this.e == 2) {
                lpxVar.a(new IllegalStateException("Initialization failed prior to registering this callback, please add an initialization callback to the EmojiCompat.Config instead to see the cause."));
            } else {
                this.d.add(lpxVar);
            }
        } finally {
            this.c.writeLock().unlock();
        }
    }

    public final void g(EditorInfo editorInfo) {
        if (!i() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        lpq lpqVar = this.f;
        Bundle bundle = editorInfo.extras;
        lqw lqwVar = lpqVar.b.a;
        int iB = lqwVar.b(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iB != 0 ? lqwVar.b.getInt(iB + lqwVar.a) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", lpqVar.c.g);
    }

    public final boolean i() {
        return b() == 1;
    }

    public final CharSequence j(CharSequence charSequence, int i) {
        return k(charSequence, 0, i, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0093 A[Catch: all -> 0x0084, TRY_ENTER, TryCatch #1 {all -> 0x0084, blocks: (B:27:0x0066, B:30:0x006b, B:32:0x006f, B:34:0x007e, B:40:0x0093, B:42:0x009d, B:45:0x00a2, B:47:0x00ae, B:48:0x00b1), top: B:81:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2 A[Catch: all -> 0x0084, TryCatch #1 {all -> 0x0084, blocks: (B:27:0x0066, B:30:0x006b, B:32:0x006f, B:34:0x007e, B:40:0x0093, B:42:0x009d, B:45:0x00a2, B:47:0x00ae, B:48:0x00b1), top: B:81:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c0 A[Catch: all -> 0x00f2, TRY_ENTER, TryCatch #0 {all -> 0x00f2, blocks: (B:52:0x00c0, B:55:0x00c7, B:38:0x0089), top: B:79:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence k(java.lang.CharSequence r11, int r12, int r13, int r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lpz.k(java.lang.CharSequence, int, int, int):java.lang.CharSequence");
    }
}
