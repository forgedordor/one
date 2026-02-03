package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mbd {
    public Uri a;
    public mbe b;
    public mbj c;
    private String d;
    private String e;
    private mbh f;
    private List g;
    private ekgb h;
    private long i;
    private mbr j;
    private final mbm k;

    public mbd() {
        this.b = new mbe();
        this.f = new mbh();
        this.g = Collections.EMPTY_LIST;
        int i = ekgb.d;
        this.h = ekoe.a;
        this.c = new mbj();
        this.k = mbm.a;
        this.i = -9223372036854775807L;
    }

    public final mbo a() {
        mbl mblVar;
        Uri uri = this.f.b;
        mee.c(true);
        Uri uri2 = this.a;
        if (uri2 != null) {
            String str = this.e;
            mbh mbhVar = this.f;
            mblVar = new mbl(uri2, str, mbhVar.a != null ? new mbi(mbhVar) : null, this.g, this.h, this.i);
        } else {
            mblVar = null;
        }
        String str2 = this.d;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        mbg mbgVar = new mbg(this.b);
        mbk mbkVar = new mbk(this.c);
        mbr mbrVar = this.j;
        if (mbrVar == null) {
            mbrVar = mbr.a;
        }
        return new mbo(str3, mbgVar, mblVar, mbkVar, mbrVar, this.k);
    }

    public final void b(String str) {
        this.d = str;
    }

    public mbd(mbo mboVar) {
        this();
        this.b = new mbe(mboVar.e);
        this.d = mboVar.a;
        this.j = mboVar.d;
        this.c = new mbj(mboVar.c);
        this.k = mboVar.f;
        mbl mblVar = mboVar.b;
        if (mblVar != null) {
            this.e = mblVar.b;
            this.a = mblVar.a;
            this.g = mblVar.e;
            this.h = mblVar.g;
            mbi mbiVar = mblVar.c;
            this.f = mbiVar != null ? new mbh(mbiVar) : new mbh();
            this.i = mblVar.i;
        }
    }
}
