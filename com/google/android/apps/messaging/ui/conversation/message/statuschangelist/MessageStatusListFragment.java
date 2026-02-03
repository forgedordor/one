package com.google.android.apps.messaging.ui.conversation.message.statuschangelist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.conversation.message.statuschangelist.MessageStatusListFragment;
import defpackage.aiwq;
import defpackage.aiwu;
import defpackage.axgc;
import defpackage.bace;
import defpackage.bqti;
import defpackage.bqtk;
import defpackage.bqub;
import defpackage.cukf;
import defpackage.cwmz;
import defpackage.cwng;
import defpackage.eg;
import defpackage.im;
import defpackage.lcj;
import defpackage.ljb;
import defpackage.lzf;
import defpackage.lzg;
import defpackage.lzp;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MessageStatusListFragment extends cwmz implements lzf<bqtk> {
    public String ai;
    public aiwu aj;
    public aiwq ak;
    public axgc al;
    public long am;
    private ljb an;
    private SimpleDateFormat ao;

    @Override // defpackage.gu, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        av(true);
        return layoutInflater.inflate(R.layout.message_status_list, viewGroup, false);
    }

    @Override // defpackage.lzf
    public final lzp a(int i, Bundle bundle) {
        eg egVarG = G();
        bqti bqtiVar = bqub.c;
        this.an = new ljb(egVarG, new String[]{bqtiVar.c.toString(), bqtiVar.d.toString()}, new int[]{android.R.id.text1, android.R.id.text2});
        this.ao = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS", Locale.US);
        ljb ljbVar = this.an;
        ljbVar.g = new cwng(this);
        gj(ljbVar);
        return this.al.a("DontKnow", z(), bace.l(z()), new lcj() { // from class: cwnh
            @Override // defpackage.lcj
            public final Object a() {
                String[] strArr = bqub.a;
                String[] strArr2 = bqub.a;
                bqty bqtyVar = new bqty(strArr2);
                bqtyVar.v();
                bqtj bqtjVar = bqub.c.c;
                bqtyVar.n(new dqxl("MIN($V - $V)", new Object[]{bqtjVar, 0}), "minq");
                final MessageStatusListFragment messageStatusListFragment = this.a;
                bqtyVar.d(new Function() { // from class: cwna
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bqua bquaVar = (bqua) obj;
                        bquaVar.b(messageStatusListFragment.ai);
                        return bquaVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                final bqtx bqtxVarB = bqtyVar.b();
                bqty bqtyVar2 = new bqty(strArr2);
                bqtyVar2.v();
                bqtyVar2.n(new dqxl("MAX($V + $V)", new Object[]{bqtjVar, 0}), "maxq");
                bqtyVar2.d(new Function() { // from class: cwnb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bqua bquaVar = (bqua) obj;
                        bquaVar.b(messageStatusListFragment.ai);
                        return bquaVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                final bqtx bqtxVarB2 = bqtyVar2.b();
                String[] strArr3 = bpjz.a;
                bpjw bpjwVar = new bpjw(bpjz.a);
                bpjwVar.c(new Function() { // from class: cwnc
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bpjg bpjgVar = (bpjg) obj;
                        bpjh bpjhVar = bpjgVar.c;
                        return new bpjh[]{bpjgVar.a, bpjgVar.b, bpjhVar, bpjhVar, bpjgVar.d};
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bpjwVar.k(new bpjx((bpjy) new Function() { // from class: cwnd
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bpjy bpjyVar = (bpjy) obj;
                        bpjyVar.ap(new dqpk("events.timestamp", 9, bqtxVarB));
                        bpjyVar.ap(new dqpk("events.timestamp", 10, bqtxVarB2));
                        return bpjyVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }.apply(new bpjy())));
                bpjwVar.n(new dqxl("$V", new Object[]{2}), "table_source");
                bpjwVar.D((String) DesugarArrays.stream(new bpjt[]{new bpjt(bpjz.c.b)}).map(new Function() { // from class: bpjv
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((bpjt) obj).a();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.joining(", ")));
                bpju bpjuVarB = bpjwVar.b();
                bqty bqtyVar3 = new bqty(strArr2);
                bqtyVar3.A("MessageStatusListFragment#getQuery");
                bqtyVar3.d(new Function() { // from class: cwne
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bqua bquaVar = (bqua) obj;
                        bquaVar.b(messageStatusListFragment.ai);
                        return bquaVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bqtyVar3.c(new Function() { // from class: cwnf
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bqti bqtiVar2 = (bqti) obj;
                        return new bqtj[]{bqtiVar2.a, bqtiVar2.c, bqtiVar2.d, bqtiVar2.e, bqtiVar2.f};
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bqtyVar3.n(new dqxl("$V", new Object[]{1}), "table_source");
                bqtyVar3.p(bpjuVarB);
                ((dqox) bqtyVar3.a).j = bqtjVar.toString();
                bqtyVar3.s();
                return bqtyVar3.b();
            }
        });
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) {
        super.ae(bundle);
        lzg.a(this).c(0, bundle, this);
        this.ai = G().getIntent().getStringExtra("message_id");
    }

    @Override // defpackage.lzf
    public final /* bridge */ /* synthetic */ void b(lzp lzpVar, Object obj) {
        im imVarK;
        bqtk bqtkVar = (bqtk) obj;
        this.an.h(bqtkVar.a());
        if (bqtkVar == null || !bqtkVar.moveToFirst()) {
            this.am = 0L;
        } else {
            this.am = bqtkVar.e();
        }
        if (!(G() instanceof cukf) || (imVarK = ((cukf) G()).k()) == null) {
            return;
        }
        imVarK.setSubtitle("Id: " + this.ai + " Time: " + this.ao.format(Long.valueOf(this.am)));
    }

    @Override // defpackage.lzf
    public final void c(lzp lzpVar) {
        this.an.h(null);
    }
}
