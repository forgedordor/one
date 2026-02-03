package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aile extends dqpi {
    final /* synthetic */ ailf a;

    public aile(ailf ailfVar) {
        this.a = ailfVar;
    }

    @Override // defpackage.dqpi
    public final /* bridge */ /* synthetic */ void b(dqwl dqwlVar, dqsd dqsdVar) {
        MessagesTable.BindData bindData = (MessagesTable.BindData) dqsdVar.b();
        if (bindData == null) {
            final brdt brdtVar = (brdt) dqsdVar.c();
            if (brdtVar != null) {
                final ailf ailfVar = this.a;
                brdtVar.m(new dqyi() { // from class: aikt
                    @Override // defpackage.dqyi
                    public final boolean a(dqyq dqyqVar) {
                        if (!(dqyqVar instanceof dqpj)) {
                            return false;
                        }
                        dqpj dqpjVar = (dqpj) dqyqVar;
                        if (!dhim.a(dqpjVar.d, MessagesTable.c.a.toString()) || dqpjVar.b != 1) {
                            return false;
                        }
                        ailfVar.g(bary.b(dqpjVar.a), brdtVar.a(), Optional.empty());
                        return true;
                    }
                });
            }
            brdv brdvVar = (brdv) dqsdVar.d();
            if (brdvVar != null) {
                final ailf ailfVar2 = this.a;
                brdvVar.f(new dqyi() { // from class: aiku
                    @Override // defpackage.dqyi
                    public final boolean a(dqyq dqyqVar) {
                        ailf ailfVar3 = ailfVar2;
                        if (dqyqVar instanceof dqpj) {
                            dqpj dqpjVar = (dqpj) dqyqVar;
                            if (ailf.i(dqpjVar.d) && dqpjVar.b == 1) {
                                ailfVar3.h(bary.b(dqpjVar.a), aiwt.MESSAGE_DELETED, Optional.empty());
                                return true;
                            }
                        }
                        if (dqyqVar instanceof dqpm) {
                            dqpm dqpmVar = (dqpm) dqyqVar;
                            if (!ailf.i(dqpmVar.d) || dqpmVar.c - 1 != 2) {
                                return false;
                            }
                            Iterator it = dqpmVar.b.iterator();
                            while (it.hasNext()) {
                                ailfVar3.h(bary.b((String) it.next()), aiwt.MESSAGE_DELETED, Optional.empty());
                            }
                        }
                        return false;
                    }
                });
                return;
            }
            return;
        }
        ailf ailfVar3 = this.a;
        MessageIdType messageIdTypeE = bindData.E();
        if (messageIdTypeE == null) {
            return;
        }
        Object objAy = bindData.ay(elny.class.getName());
        String string = objAy instanceof elny ? Integer.toString(((elny) objAy).M) : null;
        if (bindData.ay("mismatchedThreadId") instanceof Boolean) {
            if (string != null) {
                string = string.concat(" ");
            }
            string = String.valueOf(string).concat(String.valueOf(aiwt.THREAD_ID_MISMATCH.d));
        }
        ailfVar3.g(messageIdTypeE, bindData.s(), Optional.ofNullable(string));
    }
}
