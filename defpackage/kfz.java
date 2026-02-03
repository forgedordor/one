package defpackage;

import java.text.BreakIterator;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kfz implements jvl {
    public final jyq a;
    public final kbi b;
    public final kgc c;
    public final CharSequence d;
    public final jzd e;
    public kgn f;
    public final int g;
    private final String h;
    private final List i;
    private final List j;
    private final kio k;
    private final boolean l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02b9 A[PHI: r7
      0x02b9: PHI (r7v16 boolean) = (r7v15 boolean), (r7v15 boolean), (r7v46 boolean) binds: [B:131:0x02af, B:132:0x02b1, B:135:0x02b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0776  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0815  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0858  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0056  */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r29v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r29v3 */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1, types: [kgw] */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [jxx] */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19, types: [android.text.Spannable, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v49 */
    /* JADX WARN: Type inference failed for: r9v50 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kfz(java.lang.String r48, defpackage.jyq r49, java.util.List r50, java.util.List r51, defpackage.kbi r52, defpackage.kio r53) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfz.<init>(java.lang.String, jyq, java.util.List, java.util.List, kbi, kio):void");
    }

    @Override // defpackage.jvl
    public final float a() {
        return this.e.b();
    }

    @Override // defpackage.jvl
    public final float b() {
        float f;
        jzd jzdVar = this.e;
        if (!Float.isNaN(jzdVar.c)) {
            return jzdVar.c;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(jzdVar.b.getTextLocale());
        CharSequence charSequence = jzdVar.a;
        lineInstance.setText(new jyw(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new Comparator() { // from class: jzc
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                fcti fctiVar = (fcti) obj;
                fcti fctiVar2 = (fcti) obj2;
                return (((Number) fctiVar.b).intValue() - ((Number) fctiVar.a).intValue()) - (((Number) fctiVar2.b).intValue() - ((Number) fctiVar2.a).intValue());
            }
        });
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new fcti(Integer.valueOf(i), Integer.valueOf(next)));
            } else {
                fcti fctiVar = (fcti) priorityQueue.peek();
                if (fctiVar != null && ((Number) fctiVar.b).intValue() - ((Number) fctiVar.a).intValue() < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new fcti(Integer.valueOf(i), Integer.valueOf(next)));
                }
            }
            i = next;
        }
        if (priorityQueue.isEmpty()) {
            f = 0.0f;
        } else {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            fcti fctiVar2 = (fcti) it.next();
            float fA = jzdVar.a(((Number) fctiVar2.a).intValue(), ((Number) fctiVar2.b).intValue());
            while (it.hasNext()) {
                fcti fctiVar3 = (fcti) it.next();
                fA = Math.max(fA, jzdVar.a(((Number) fctiVar3.a).intValue(), ((Number) fctiVar3.b).intValue()));
            }
            f = fA;
        }
        jzdVar.c = f;
        return f;
    }

    @Override // defpackage.jvl
    public final boolean c() {
        kgn kgnVar = this.f;
        if (kgnVar != null && kgnVar.a()) {
            return true;
        }
        if (!this.l && kga.a(this.a)) {
            int i = kgi.a;
            if (((Boolean) kgi.a().a()).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
