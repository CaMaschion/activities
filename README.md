## O que é uma activity ?

[https://developer.android.com/guide/components/activities/intro-activities](https://developer.android.com/guide/components/activities/intro-activities)

**Activity** ou **atividade** é por onde o usuário interage com o sistema, basicamente são associadas a uma tela do aplicativo e são essenciais para a navegação do usuário.
Quando iniciamos qualquer aplicativo, a tela que aparece e pela qual interagimos é uma **activity**.

### **⇒ Declaração da activity no arquivo manifest**

Toda activity precisa ser declarada no **arquivo manifest, caso contrário o sistema não saberá que essa activity existe, utiliza-se o** elemento `[<activity>](https://developer.android.com/guide/topics/manifest/activity-element)` para atividades.

```kotlin
      **<activity
            android:name=".MainActivity"
            android:exported="true">**
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        **</activity>**
```

**Obs:** o elemento **EXPORTED** define se a activity pode ser iniciada por componentes de outros aplicativos.

- true ⇒ **a activity** **estará acessível a qualquer aplicativo e poderá ser iniciada por seu nome de classe**
- false ⇒ **a activity poderá ser iniciada apenas por componentes do mesmo aplicativo, aplicativos com o mesmo ID do usuário ou componentes do sistema privilegiado.** Este é o valor padrão quando não há *intent filter.*

Se uma activity em seu aplicativo incluir *intent filters*, defina esse elemento como "true" para permitir que outros aplicativos o iniciem. 

**Por exemplo**, se a activity for a activity principal do aplicativo e incluir a categoria **"android.intent.category.LAUNCHER".**
Se esse elemento for definido como "falso" e um aplicativo tentar iniciar a atividade, o sistema lançará uma **ActivityNotFoundException**.

### **⇒ Como ativar/usar a activity**

A ativação/utilização deste componente é feita por *intent, que é um tipo de mensagem para solicitar uma ação de outros componentes, pertencentes ao aplicativo ou não.* 

**Por exemplo, quando é preciso abrir uma segunda activity a partir de uma primeira activity utiliza-se a **INTENT** e são as intents passadas no método **startActivity(intent) ou startActivityForResult(intent)** que definem qual ação será executada.

![Screenshot 2022-12-28 at 11.28.20.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f89e7313-3067-40d9-b6ab-8c1247be94a4/Screenshot_2022-12-28_at_11.28.20.png)

Para fechar uma activity, utiliza-se o método **finish().**

***Obs: fazer um resumo sobre intent:***

[*https://developer.android.com/guide/components/intents-filters](https://developer.android.com/guide/components/intents-filters)* 

