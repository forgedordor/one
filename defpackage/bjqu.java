package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bjqu extends dqpg {
    public MessageIdType a;
    public MessageIdType b;
    public long c;
    public String d;
    public int e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String[] j;
    public String[] k;
    public Uri[] l;
    public String[] m;
    public String[] n;
    public long[] o;
    public long[] p;
    public String q;
    public long r;
    public String s;
    public String t;
    public boolean u;

    public bjqu() {
        super(bkgf.c());
        MessageIdType messageIdType = bary.a;
        this.a = messageIdType;
        this.b = messageIdType;
        this.c = 0L;
        this.e = -2;
        this.r = 0L;
        this.u = false;
    }

    public final bjqs a() {
        bjqt bjqtVar = new bjqt();
        bjqtVar.aD(aB());
        bjqtVar.a = this.a;
        bjqtVar.b = this.b;
        bjqtVar.c = this.c;
        bjqtVar.e = this.d;
        bjqtVar.f = this.e;
        bjqtVar.g = this.f;
        bjqtVar.h = this.g;
        bjqtVar.i = this.h;
        bjqtVar.j = this.i;
        bjqtVar.l = this.j;
        bjqtVar.m = this.k;
        bjqtVar.n = this.l;
        bjqtVar.o = this.m;
        bjqtVar.p = this.n;
        bjqtVar.q = this.o;
        bjqtVar.r = this.p;
        bjqtVar.t = this.q;
        bjqtVar.u = this.r;
        bjqtVar.v = this.s;
        bjqtVar.w = this.t;
        bjqtVar.x = this.u;
        bjqtVar.g();
        bjqtVar.cM = aC();
        return bjqtVar;
    }

    public final void b(String str) {
        aE(6);
        if (!this.aC) {
            str = cssb.a(str);
        }
        this.g = str;
    }

    public final void c(long[] jArr) {
        int i = this.aB;
        if (i < 26040) {
            dqru.x("duration", i);
        }
        aE(14);
        this.o = jArr;
    }
}
