using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;


public class PlatformT: MonoBehaviour
{

    public int count;

    public Text T_count;

    public SoundEffector soundeffector;
    // Start is called before the first frame update
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        T_count.text = count.ToString();
    }

    void OnTriggerEnter(Collider other)
    {
        if(other.gameObject.CompareTag("cube"))

        {count++;
        
        soundeffector.PlayHitSound();}
    }

    void OnTriggerExit(Collider other)
    {
        if(other.gameObject.CompareTag("cube"))

        {count--;
        soundeffector.PlayFallSound();}
    }

  
}
