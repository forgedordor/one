package com.google.chat.smartmessaging.smartreply.android;

import defpackage.cdta;
import defpackage.ejha;
import defpackage.ejjt;
import defpackage.ejkv;
import defpackage.ejlx;
import defpackage.ejol;
import defpackage.ekrg;
import defpackage.ezcy;
import defpackage.ezdv;
import defpackage.ezdx;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class SensitiveClassifierJni implements ejol {
    public static final ekrg a = ekrg.c("com/google/chat/smartmessaging/smartreply/android/SensitiveClassifierJni");
    private final int b;
    private long modelPtr;

    public SensitiveClassifierJni(ejjt ejjtVar, cdta cdtaVar) throws ejkv {
        this.modelPtr = 0L;
        this.b = ejjtVar.e;
        String strA = cdtaVar.a();
        if (strA.isEmpty()) {
            throw new ejkv("Cannot read the SensitiveClassifier File: ".concat(ejlx.b(ejjtVar.c == 2 ? (ejha) ejjtVar.d : ejha.a)));
        }
        this.modelPtr = loadModel(strA);
    }

    private final synchronized void b() {
        internalClose();
        this.modelPtr = 0L;
    }

    private native void internalClose();

    private native boolean isSensitive(ArrayList<String> arrayList);

    private native long loadModel(String str);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ejol
    public final Set a(ezcy ezcyVar) {
        ArrayList<String> arrayList = new ArrayList<>();
        ezdx ezdxVar = ezcyVar.f;
        if (ezdxVar == null) {
            ezdxVar = ezdx.a;
        }
        int size = ezdxVar.b.size();
        for (int i = 0; i < size && i < this.b; i++) {
            ezdx ezdxVar2 = ezcyVar.f;
            if (ezdxVar2 == null) {
                ezdxVar2 = ezdx.a;
            }
            ezdv ezdvVar = (ezdv) ezdxVar2.b.get((size - 1) - i);
            arrayList.add(ezdvVar.b == 30 ? (String) ezdvVar.c : "");
        }
        HashSet hashSet = new HashSet();
        if (isSensitive(arrayList)) {
            hashSet.add("SENSITIVE");
        }
        return hashSet;
    }

    protected final void finalize() {
        b();
    }
}
