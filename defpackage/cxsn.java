package defpackage;

import android.content.Context;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxsn extends cqdj {
    public static final /* synthetic */ int y = 0;
    final /* synthetic */ ProgressBar a;
    final /* synthetic */ int b;
    final /* synthetic */ TextView c;
    final /* synthetic */ int k;
    final /* synthetic */ String l;
    final /* synthetic */ cmot m;
    final /* synthetic */ Map n;
    final /* synthetic */ int o;
    final /* synthetic */ Random p;
    final /* synthetic */ long q;
    final /* synthetic */ String r;
    final /* synthetic */ String[] s;
    final /* synthetic */ long t;
    final /* synthetic */ Context u;
    final /* synthetic */ Context v;
    final /* synthetic */ int w;
    final /* synthetic */ cxsp x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxsn(cxsp cxspVar, ProgressBar progressBar, int i, TextView textView, int i2, String str, cmot cmotVar, Map map, int i3, Random random, long j, String str2, String[] strArr, long j2, Context context, Context context2, int i4) {
        super("Bugle.Async.Debug.createFakeTelephonyConversations.Duration", null);
        this.a = progressBar;
        this.b = i;
        this.c = textView;
        this.k = i2;
        this.l = str;
        this.m = cmotVar;
        this.n = map;
        this.o = i3;
        this.p = random;
        this.q = j;
        this.r = str2;
        this.s = strArr;
        this.t = j2;
        this.u = context;
        this.v = context2;
        this.w = i4;
        this.x = cxspVar;
    }

    private final Integer c() {
        Map map = this.n;
        return (Integer) map.keySet().toArray()[this.p.nextInt(map.size())];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02f7 A[Catch: all -> 0x0388, TryCatch #1 {all -> 0x0388, blocks: (B:38:0x022a, B:39:0x0285, B:41:0x0288, B:48:0x0298, B:55:0x02f1, B:57:0x02f7, B:59:0x031f, B:60:0x032f, B:61:0x033c, B:47:0x0291, B:49:0x02b9, B:51:0x02cc, B:53:0x02d6, B:54:0x02e7, B:62:0x034d, B:64:0x035b, B:66:0x036f, B:67:0x037b), top: B:80:0x022a }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x033c A[SYNTHETIC] */
    @Override // defpackage.cqdj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* synthetic */ java.lang.Object a(java.lang.Object[] r58) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 913
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxsn.a(java.lang.Object[]):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void onProgressUpdate(Integer... numArr) {
        ProgressBar progressBar;
        TextView textView;
        if (numArr == null || numArr.length < 2 || (progressBar = this.a) == null || (textView = this.c) == null) {
            return;
        }
        Integer num = numArr[0];
        int iIntValue = num.intValue();
        Integer num2 = numArr[1];
        textView.setText(iIntValue < num2.intValue() ? String.format(Locale.US, "Progress... %d/%d msgs", num, num2) : "Progress... done!");
        progressBar.setProgress(iIntValue, true);
    }

    @Override // defpackage.cqdj
    protected final /* bridge */ /* synthetic */ void d(Object obj) {
        Integer numValueOf = Integer.valueOf(this.b);
        onProgressUpdate(numValueOf, numValueOf);
        this.x.k.j("Telephony DB populated. Now syncing...");
        ecem.d(new Runnable() { // from class: cxsm
            @Override // java.lang.Runnable
            public final void run() {
                ((cmqf) this.a.x.j.b()).k(enqq.FAKE_MESSAGE_GENERATOR);
            }
        }, 5000L);
    }

    @Override // android.os.AsyncTask
    protected final void onPreExecute() {
        ProgressBar progressBar = this.a;
        if (progressBar != null) {
            progressBar.setMax(this.b);
        }
        onProgressUpdate(0, Integer.valueOf(this.b));
    }
}
