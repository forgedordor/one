package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.debug.DebugGServiceKeysFragment;
import j$.util.function.Consumer$CC;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxam implements View.OnClickListener {
    final /* synthetic */ String a;
    final /* synthetic */ DebugGServiceKeysFragment b;

    public cxam(DebugGServiceKeysFragment debugGServiceKeysFragment, String str) {
        this.a = str;
        this.b = debugGServiceKeysFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final DebugGServiceKeysFragment debugGServiceKeysFragment = this.b;
        ekgb ekgbVarA = DebugGServiceKeysFragment.a((eotm) debugGServiceKeysFragment.ak.b());
        int i = ((ekoe) ekgbVarA).c;
        final HashMap mapH = ekmi.h(i);
        for (int i2 = 0; i2 < i; i2++) {
            DebugGServiceKeysFragment.b((String) ekgbVarA.get(i2)).ifPresent(new Consumer() { // from class: cxaj
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    DebugGServiceKeysFragment debugGServiceKeysFragment2 = debugGServiceKeysFragment;
                    String str = (String) obj;
                    mapH.put(str, String.valueOf(((eotm) debugGServiceKeysFragment2.ak.b()).b(str).orElse(Boolean.valueOf(((eotm) debugGServiceKeysFragment2.ak.b()).d(str)))));
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        final cxap cxapVar = new cxap(this.a, mapH, (eosc) debugGServiceKeysFragment.al.b());
        ((egpr) debugGServiceKeysFragment.ai.b()).g(egpq.b(eijx.f(new Runnable() { // from class: cxao
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                cxap cxapVar2 = cxapVar;
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(cxapVar2.a)));
                    try {
                        Map map = cxapVar2.b;
                        for (String str : map.keySet()) {
                            bufferedWriter.write(str);
                            bufferedWriter.write(" : ");
                            bufferedWriter.write((String) map.get(str));
                            bufferedWriter.write("\n");
                        }
                        bufferedWriter.close();
                    } finally {
                    }
                } catch (IOException e) {
                    ekrw ekrwVarJ = DebugGServiceKeysFragment.a.j();
                    ekrwVarJ.X(eksq.a, "BugleDiagnostics");
                    ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/ui/debug/DebugGServiceKeysFragment$AutorampFlagWriter", "writeAutorampFlagsToFile", (char) 361, "DebugGServiceKeysFragment.java")).q("Failed to dump autoramp flags to file");
                }
            }
        }, cxapVar.c)), debugGServiceKeysFragment.c);
    }
}
