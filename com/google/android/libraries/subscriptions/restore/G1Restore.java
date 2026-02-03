package com.google.android.libraries.subscriptions.restore;

import android.content.Context;
import android.provider.Telephony;
import com.google.android.libraries.subscriptions.restore.IG1Restore;
import defpackage.ecoz;
import defpackage.ecpa;
import defpackage.ecpb;
import defpackage.ejwh;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class G1Restore extends IG1Restore.Stub {
    private final Context a;
    private final ecpb b;
    private final ecpa c;

    /* renamed from: $r8$lambda$oufppheGWGrvC-nxm-Ywl0kdQKQ, reason: not valid java name */
    public static /* synthetic */ boolean m347$r8$lambda$oufppheGWGrvCnxmYwl0kdQKQ(G1Restore g1Restore) {
        Context context = g1Restore.a;
        return ejwh.a(Telephony.Sms.getDefaultSmsPackage(context), context.getPackageName());
    }

    public G1Restore(Context context, ecpb ecpbVar, ecpa ecpaVar) {
        this.a = context;
        this.b = ecpbVar;
        this.c = ecpaVar;
    }

    public static ecpa defaultConfig() {
        return new ecoz();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x060e A[Catch: all -> 0x0612, TRY_LEAVE, TryCatch #23 {all -> 0x0612, blocks: (B:298:0x05e1, B:313:0x060e, B:310:0x0609, B:309:0x0606, B:265:0x0558, B:268:0x0560, B:291:0x05c7, B:296:0x05d9, B:300:0x05f3, B:294:0x05ce, B:288:0x05c2, B:287:0x05bf, B:271:0x0592, B:274:0x059a, B:277:0x05a3, B:278:0x05a9, B:279:0x05b1, B:284:0x05ba, B:306:0x0601), top: B:520:0x05e1, inners: #18, #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x06a8 A[Catch: all -> 0x06b1, TRY_ENTER, TRY_LEAVE, TryCatch #9 {all -> 0x06b1, blocks: (B:325:0x068a, B:333:0x06a8, B:340:0x06b8, B:342:0x06fa, B:348:0x0719), top: B:494:0x068a }] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x06b8 A[Catch: all -> 0x06b1, TRY_ENTER, TryCatch #9 {all -> 0x06b1, blocks: (B:325:0x068a, B:333:0x06a8, B:340:0x06b8, B:342:0x06fa, B:348:0x0719), top: B:494:0x068a }] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x070b A[Catch: all -> 0x0852, TRY_LEAVE, TryCatch #22 {all -> 0x0852, blocks: (B:331:0x069f, B:338:0x06b4, B:344:0x0702, B:346:0x070b, B:350:0x0724), top: B:518:0x069f }] */
    /* JADX WARN: Removed duplicated region for block: B:389:0x07e0 A[Catch: all -> 0x0897, TryCatch #26 {all -> 0x0897, blocks: (B:386:0x07c6, B:352:0x0735, B:354:0x0759, B:385:0x07be, B:387:0x07cc, B:389:0x07e0, B:390:0x07e9, B:392:0x0801, B:393:0x080a, B:395:0x081a, B:397:0x0834, B:398:0x083d, B:399:0x0840, B:405:0x085b, B:407:0x0866, B:408:0x086b, B:410:0x086f, B:411:0x0874, B:413:0x0878, B:414:0x087d, B:415:0x088c, B:416:0x088d, B:417:0x0896, B:356:0x0762, B:363:0x0794, B:380:0x07b3, B:379:0x07b0, B:382:0x07b5, B:383:0x07bc, B:358:0x0780, B:361:0x078f, B:372:0x07a6, B:371:0x07a3, B:368:0x079e, B:359:0x078a, B:376:0x07ab, B:357:0x077a), top: B:526:0x0735, inners: #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0801 A[Catch: all -> 0x0897, TryCatch #26 {all -> 0x0897, blocks: (B:386:0x07c6, B:352:0x0735, B:354:0x0759, B:385:0x07be, B:387:0x07cc, B:389:0x07e0, B:390:0x07e9, B:392:0x0801, B:393:0x080a, B:395:0x081a, B:397:0x0834, B:398:0x083d, B:399:0x0840, B:405:0x085b, B:407:0x0866, B:408:0x086b, B:410:0x086f, B:411:0x0874, B:413:0x0878, B:414:0x087d, B:415:0x088c, B:416:0x088d, B:417:0x0896, B:356:0x0762, B:363:0x0794, B:380:0x07b3, B:379:0x07b0, B:382:0x07b5, B:383:0x07bc, B:358:0x0780, B:361:0x078f, B:372:0x07a6, B:371:0x07a3, B:368:0x079e, B:359:0x078a, B:376:0x07ab, B:357:0x077a), top: B:526:0x0735, inners: #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:395:0x081a A[Catch: all -> 0x0897, TryCatch #26 {all -> 0x0897, blocks: (B:386:0x07c6, B:352:0x0735, B:354:0x0759, B:385:0x07be, B:387:0x07cc, B:389:0x07e0, B:390:0x07e9, B:392:0x0801, B:393:0x080a, B:395:0x081a, B:397:0x0834, B:398:0x083d, B:399:0x0840, B:405:0x085b, B:407:0x0866, B:408:0x086b, B:410:0x086f, B:411:0x0874, B:413:0x0878, B:414:0x087d, B:415:0x088c, B:416:0x088d, B:417:0x0896, B:356:0x0762, B:363:0x0794, B:380:0x07b3, B:379:0x07b0, B:382:0x07b5, B:383:0x07bc, B:358:0x0780, B:361:0x078f, B:372:0x07a6, B:371:0x07a3, B:368:0x079e, B:359:0x078a, B:376:0x07ab, B:357:0x077a), top: B:526:0x0735, inners: #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0906 A[Catch: IOException -> 0x0944, TRY_LEAVE, TryCatch #12 {IOException -> 0x0944, blocks: (B:24:0x00ab, B:75:0x0188, B:76:0x018d, B:78:0x0193, B:446:0x0902, B:448:0x0906, B:445:0x08fa), top: B:499:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0914  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0925  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0928 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:481:0x00d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0185 A[EDGE_INSN: B:537:0x0185->B:74:0x0185 BREAK  A[LOOP:0: B:27:0x00c9->B:73:0x0181], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0172 A[Catch: all -> 0x0163, TRY_ENTER, TryCatch #2 {all -> 0x0163, blocks: (B:30:0x00d3, B:32:0x00dc, B:35:0x00ec, B:37:0x00f2, B:39:0x00fa, B:40:0x00ff, B:43:0x0109, B:48:0x0116, B:62:0x0158, B:53:0x0122, B:55:0x0132, B:60:0x0140, B:61:0x0145, B:63:0x015c, B:33:0x00e4, B:70:0x0172, B:72:0x017e), top: B:481:0x00d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0193 A[Catch: IOException -> 0x0944, TRY_LEAVE, TryCatch #12 {IOException -> 0x0944, blocks: (B:24:0x00ab, B:75:0x0188, B:76:0x018d, B:78:0x0193, B:446:0x0902, B:448:0x0906, B:445:0x08fa), top: B:499:0x00ab }] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.libraries.subscriptions.restore.IG1Restore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int requestRestore(android.net.Uri r39, android.net.Uri r40, android.net.Uri r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.subscriptions.restore.G1Restore.requestRestore(android.net.Uri, android.net.Uri, android.net.Uri):int");
    }
}
